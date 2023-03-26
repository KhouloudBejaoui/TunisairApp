package com.TunisairApp.repository;

import com.TunisairApp.entity.Ense_Restauration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ense_RestaurationRepository extends JpaRepository<Ense_Restauration,Long> {
}
