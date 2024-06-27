package com.example.demo.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Student {
	@NotEmpty(message="enter your name")
     private String name;
	@NotEmpty(message="enter your email")
     private String email;
	@NotNull(message="enter your phno")
     private Long phno;
	@NotEmpty(message="enter your address")
     private String address;
}
