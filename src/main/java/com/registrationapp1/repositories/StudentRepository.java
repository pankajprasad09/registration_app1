package com.registrationapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registrationapp1.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
