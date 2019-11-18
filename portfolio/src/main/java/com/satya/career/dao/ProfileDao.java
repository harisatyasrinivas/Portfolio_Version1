package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.Profile;

@Repository
public interface ProfileDao extends JpaRepository<Profile, Long>{



}
