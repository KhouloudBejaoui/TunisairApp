package com.TunisairApp.repository;

import com.TunisairApp.entity.Aviateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AviateurRepository extends JpaRepository<Aviateur,Long> {
}
