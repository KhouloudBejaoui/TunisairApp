package com.TunisairApp.repository;

import com.TunisairApp.entity.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeroportRepository extends JpaRepository<Aeroport,Long> {
}
