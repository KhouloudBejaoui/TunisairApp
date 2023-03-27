package com.TunisairApp.service;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.repository.AviateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class AviateurService {
    @Autowired
    AviateurRepository aviateurRepository;

    public List<Aviateur> retrieveAllAviateurs() {
        List<Aviateur> aviateurs = (List<Aviateur>) aviateurRepository.findAll();

        return aviateurs;
    }
    public ResponseEntity<Aviateur> retrieveAviateur(long id) {

        Optional<Aviateur> aviateur = aviateurRepository.findById(id);
        if (aviateur.isPresent()) {
            return ResponseEntity.ok(aviateur.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<Aviateur> addAviateur(Aviateur aviateur) {

        if (aviateur == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        aviateurRepository.save(aviateur);
        return ResponseEntity.ok(aviateur);
    }


    public ResponseEntity<Aviateur> updateAviateur(long id, Aviateur aviateur) {

        if (aviateur == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Optional<Aviateur> optionalAviateur = aviateurRepository.findById(id);
        if (optionalAviateur.isPresent()) {
            aviateur.setId(id);
            aviateurRepository.save(aviateur);
            return ResponseEntity.ok(optionalAviateur.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    public void deleteAviateur(long id) {

        aviateurRepository.deleteById(id);
    }


}
