package com.br.zup.validateions.controllers.dtos;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class UserRegisterDTO {

    private LocalDate now;

    @NotBlank(message = "This field cant be blank")
    @NotNull(message = "This field cant be null")
    @Pattern(regexp = "[A-Za-z]+\\s[A-Za-z]+", message = "Need be name and lastname")
    private String name;

    @NotNull(message = "This field cant be null")
    @Min(value = 18, message = "You cant have under 18 years old")
    @Max(value = 110, message = "You cant have more than 110 years old")
    private int age;

    @Past(message = "test")
    private int yearOfBirth;

    @NotBlank(message = "This field cant be blank")
    @NotNull(message = "This field cant be null")
    @Pattern(regexp = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+).(\\.[a-z]{2,3})$",
            message = "This format of email is not valid")
    private String email;

    public UserRegisterDTO() {
    }

    public int getNow(){
        return now.getDayOfYear();
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
