package com.company;

public class Parent {

    private String Growingup;
    private int age;
    private String Education;
    private String Gender;

    public Parent(String growingup, int age, String education, String gender) {
        Growingup = growingup;
        this.age = age;
        Education = education;
        Gender = gender;
    }

    public String getGrowingup() {
        return Growingup;
    }

    public int getAge() {
        return age;
    }

    public String getEducation() {
        return Education;
    }

    public String getGender() {
        return Gender;
    }
}
