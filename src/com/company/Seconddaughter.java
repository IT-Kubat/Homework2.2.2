package com.company;

public class Seconddaughter extends Parent implements Printable {

    private String Activity;

    public Seconddaughter(String growingup, int age, String education, String gender, String activity) {
        super(growingup, age, education, gender);
        Activity = activity;
    }

    public String getActivity() {
        return Activity;
    }

    @Override
    public void print() {
        System.out.println("activity" + getActivity() + " /n "
                + " growing up: " + getGrowingup() + "/n "
                + " age: " + getAge() + " /n "
                + " education: " + getEducation() + " /n "
                + " gender: " + getGender());

    }
}
