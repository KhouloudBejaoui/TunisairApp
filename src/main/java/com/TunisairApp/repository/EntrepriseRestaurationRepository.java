package com.TunisairApp.repository;

import com.TunisairApp.entity.EntrepriseRestauration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRestaurationRepository extends JpaRepository<EntrepriseRestauration,Long> {
}
