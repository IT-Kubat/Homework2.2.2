package com.company;

public class Thirdson extends Parent implements Printable {

    private String Sound;

    public Thirdson(String growingup, int age, String education, String gender, String sound) {
        super(growingup, age, education, gender);
        Sound = sound;
    }

    public String getSound() {
        return Sound;
    }

    @Override
    public void print() {
        System.out.println("sound: " + getSound() + " /n "
                + " growing up: " + getGrowingup() + "/n "
                + " age: " + getAge() + " /n "
                + " education: " + getEducation() + " /n "
                + " gender: " + getGender());

    }
}
