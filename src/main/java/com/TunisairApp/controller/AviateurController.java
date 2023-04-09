package com.TunisairApp.controller;

import com.TunisairApp.dto.AviateurDTO;
import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.service.AviateurService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/oauth")
public class AviateurController {

    public final static String FOUND = "FOUND";
    public final static String BAD_REQUEST = "BAD_REQUEST";
    public final static String NOT_FOUND = "NOT_FOUND";
    public final static String NULL = "ID NULL DETECTED";

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    AviateurService aviateurService;

    public AviateurController(AviateurService aviateurService) {
        super();
        this.aviateurService = aviateurService;
    }

    @GetMapping("/getAviateurs")
    @ResponseBody
    public List<AviateurDTO> getAviateurs() {
        return aviateurService.retrieveAllAviateurs().stream().map(aviateur -> modelMapper.map(aviateur, AviateurDTO.class))
                .collect(Collectors.toList());

    }
    @GetMapping(value = "/getAviateur/{id}")
    public ResponseEntity<Object> getAviateur(@PathVariable("id") long id) {
        ResponseEntity<Aviateur> aviateur = aviateurService.retrieveAviateur(id);
        if (aviateur.getStatusCodeValue() == 200) {
            AviateurDTO aviateurDto = modelMapper.map(aviateur.getBody(), AviateurDTO.class);
            return new ResponseEntity<>(aviateurDto, HttpStatus.OK);
        } else if(aviateur.getStatusCodeValue() == 404){
            return new ResponseEntity<>(NOT_FOUND,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(NULL,HttpStatus.OK);

        }
    }

    @PostMapping("/addAviateur")
    public ResponseEntity<Object> addAviateur(@RequestBody AviateurDTO aviateurDTO) {
        Aviateur aviateurReq = modelMapper.map(aviateurDTO, Aviateur.class);
        ResponseEntity<Aviateur> aviateur = aviateurService.addAviateur(aviateurReq);
        if (aviateur.getStatusCodeValue() == 200) {
            AviateurDTO aviateurRes = modelMapper.map(aviateur.getBody(), AviateurDTO.class);
            return new ResponseEntity<>(aviateurRes, HttpStatus.OK);
        } else if (aviateur.getStatusCodeValue() == 400) {
            return new ResponseEntity<>(BAD_REQUEST, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(FOUND, HttpStatus.FOUND);
        }
    }


    @PutMapping(value = "/Aviateur/{id}")
    public ResponseEntity<Object> updateAviateur(@PathVariable("id") long id, @RequestBody AviateurDTO aviateurDTO) {
        Aviateur avReq = modelMapper.map(aviateurDTO, Aviateur.class);
        ResponseEntity<Aviateur> av = aviateurService.updateAviateur(id, avReq);

        if (av.getStatusCodeValue() == 200) {
            AviateurDTO avRes = modelMapper.map(av.getBody(), AviateurDTO.class);
            return new ResponseEntity<>(avRes, HttpStatus.OK);
        } else if (av.getStatusCodeValue() == 400) {
            return new ResponseEntity<>(BAD_REQUEST, HttpStatus.BAD_REQUEST);
        } else if(av.getStatusCodeValue() == 404){
            return new ResponseEntity<>(NOT_FOUND,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(NULL,HttpStatus.OK);

        }

    }

    @DeleteMapping(value = "/Aviateur/{id}")
    public void deleteAviateur(@PathVariable("id") long id) {
        aviateurService.deleteAviateur(id);
    }




}
