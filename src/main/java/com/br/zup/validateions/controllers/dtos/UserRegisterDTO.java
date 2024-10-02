package com.br.zup.validateions.controllers.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserRegisterDTO {

    @NotBlank(message = "This field cant be blank")
    @NotNull(message = "This field cant be null")
    @Pattern(regexp = "[A-Za-z]+\\s[A-Za-z]+", message = "Need be name and lastname")
    private String name;

    private int age;
    private int yearOfBirth;
    private String email;

    public UserRegisterDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
