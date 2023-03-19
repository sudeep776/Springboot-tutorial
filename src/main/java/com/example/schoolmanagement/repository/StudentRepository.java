package com.example.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.schoolmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}
