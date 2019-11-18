package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Long>{

}
