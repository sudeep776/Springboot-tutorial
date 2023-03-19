package com.example.schoolmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.schoolmanagement.annotation.CreateCheck;
import com.example.schoolmanagement.annotation.UpdateCheck;
import com.example.schoolmanagement.dto.StudentsResponse;
import com.example.schoolmanagement.entity.Student;
import com.example.schoolmanagement.exception.AppError;
import com.example.schoolmanagement.service.StudentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping ("/students") // CRUD
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping ("")
    public ResponseEntity<Object> addUser(@RequestBody @Valid @Validated(CreateCheck.class) Student user, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(AppError.builder().errorMessage(errors.getFieldError().getDefaultMessage()).errorCode("bad request").build());
        }
        return ResponseEntity.ok().body(studentService.addStudent(user));
    }

    @GetMapping ("")
    public StudentsResponse getStudents(@RequestParam ("page") Integer page, @RequestParam ("limit") Integer limit) {
        return studentService.getStudents(page, limit);
    }

    @PutMapping ("/{studentId}")
    public ResponseEntity<Object> updateUser(@RequestBody @Valid @Validated(UpdateCheck.class) Student user, @PathVariable ("studentId") long id,  Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(AppError.builder().errorMessage(errors.getFieldError().getDefaultMessage()).errorCode("bad request").build());
        }
        return ResponseEntity.ok().body(studentService.updateStudent(user, id));
    }

    @DeleteMapping ("/{id}")
    public void deleteUser(@PathVariable long id) {
        studentService.deleteStudent(id);
    }

    @GetMapping ("/hello")
    public String sayHello() {
        return "Hello";
    }
}
