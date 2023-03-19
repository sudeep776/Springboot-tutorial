package com.example.schoolmanagement.dto;

import java.util.List;
import com.example.schoolmanagement.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsResponse {
    private List<Student> students;
    private Long total;

    private boolean nextPage;
}
