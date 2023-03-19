package com.example.schoolmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.schoolmanagement.entity.Student;

public interface StudentPageRepository extends PagingAndSortingRepository<Student, Long> {}
