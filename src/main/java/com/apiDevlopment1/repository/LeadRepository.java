package com.apiDevlopment1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiDevlopment1.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
