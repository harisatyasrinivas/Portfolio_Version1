package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.ProfWebsites;

@Repository
public interface ProfWebsitesDao extends JpaRepository<ProfWebsites, Long>{


}
