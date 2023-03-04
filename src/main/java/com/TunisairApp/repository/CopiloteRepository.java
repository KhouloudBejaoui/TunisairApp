package com.TunisairApp.repository;

import com.TunisairApp.entity.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CopiloteRepository extends JpaRepository<Pilote,Long> {
}
