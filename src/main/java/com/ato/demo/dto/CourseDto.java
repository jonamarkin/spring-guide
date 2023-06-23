package com.ato.demo.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    @NotNull(message = "Name cannot be null")
    private String name;
    @NotNull(message = "Chapter count cannot be null")
    private int chapterCount;
    @NotNull(message = "Rating cannot be null")
    private double rating;
    @NotNull(message = "Author cannot be null")
    private String author;
}
