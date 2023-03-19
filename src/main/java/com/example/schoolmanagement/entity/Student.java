package com.example.schoolmanagement.entity;

// the mapper between database object (record / row) with the Java Class
import com.example.schoolmanagement.annotation.AgeValidator;
import com.example.schoolmanagement.annotation.AppPasswordValidator;
import com.example.schoolmanagement.annotation.CreateCheck;
import com.example.schoolmanagement.annotation.UpdateCheck;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // create getters for all the variables
@Setter // create setters for all the variables
@AllArgsConstructor // create a constructor with all the variables
@NoArgsConstructor
@Entity(name = "students")
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; // unique identifier for a row


    @NotBlank(message = "name must be specified", groups = { CreateCheck.class})
    private String name; //


    @AppPasswordValidator(message = "Invalid password", groups = { CreateCheck.class})
    private String password;

    @NotBlank(message = "email is required", groups = { CreateCheck.class, UpdateCheck.class})
    private String email;

    private String phone;

    @AgeValidator (message = "Age must be valid")
    private Integer age;
}
