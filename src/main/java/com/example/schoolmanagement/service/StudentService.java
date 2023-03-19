package com.example.schoolmanagement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.schoolmanagement.annotation.LogExecutionTime;
import com.example.schoolmanagement.dto.StudentsResponse;
import com.example.schoolmanagement.entity.Student;
import com.example.schoolmanagement.repository.StudentPageRepository;
import com.example.schoolmanagement.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentPageRepository studentPageRepository;

    public Student addStudent(Student user) {
        return studentRepository.save(user);
    }

    @LogExecutionTime
    public StudentsResponse getStudents(int page, int limit) {
        PageRequest pageRequest = PageRequest.of(page, limit, Sort.Direction.DESC, "id", "name");// limit & offset
        // offset: page * size
        // limit: size
        Page<Student> studentPage = studentPageRepository.findAll(pageRequest);
        long totalStudents = studentPage.getTotalElements();
        List<Student> students = studentPage.getContent();
        int currentPageSize = students.size();
        return new StudentsResponse(students, totalStudents, currentPageSize == limit);
    }

    public Student updateStudent(Student user, long id) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            user.setId(id);
            return studentRepository.save(user);
        } else {
            throw new RuntimeException("Student not found");
        }
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
