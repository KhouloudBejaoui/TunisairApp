package com.TunisairApp.repository;

import com.TunisairApp.entity.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolRepository extends JpaRepository<Vol,Long> {
}
