package com.henriqueholz.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {

    private UUID ID;
    private final Integer age;
    private final String firstName;
    private final String lastName;
    private final String course;

    public Student(
            @JsonProperty("id") UUID id,
            @JsonProperty("age") Integer age,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("course") String course) {
        this.ID = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }
}
