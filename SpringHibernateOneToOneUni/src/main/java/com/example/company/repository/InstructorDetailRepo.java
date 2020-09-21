package com.example.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.company.model.InstructorDetail;

public interface InstructorDetailRepo extends JpaRepository<InstructorDetail, Integer> {

}
