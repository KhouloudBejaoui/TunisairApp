package com.TunisairApp.repository;

import com.TunisairApp.entity.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager,Long> {
}
