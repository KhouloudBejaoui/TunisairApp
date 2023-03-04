package com.TunisairApp.repository;

import com.TunisairApp.entity.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiloteRepository extends JpaRepository<Pilote,Long> {
}
