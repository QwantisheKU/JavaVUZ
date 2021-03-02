package com.company;
import java.time.LocalDate;

public class Human {
    private int age, weight;
    private String firstName, lastName;
    private LocalDate date;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return date;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Name: "+firstName + ' ' + lastName + ", Age: " + age +", Date: " + date + ", Weight:" + weight;
    }
}
