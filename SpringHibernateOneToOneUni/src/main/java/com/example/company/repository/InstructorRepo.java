package com.example.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.company.model.Instructor;

public interface InstructorRepo extends JpaRepository<Instructor, Integer> {

}
