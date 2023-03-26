package com.TunisairApp.repository;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends JpaRepository<Avion,Long> {
}
