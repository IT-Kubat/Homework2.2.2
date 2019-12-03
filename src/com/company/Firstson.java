package com.company;

public class Firstson extends Parent  implements Printable{

    private String Ability;



    public Firstson(String growingup, int age, String education, String gender, String ability) {
        super(growingup, age, education, gender);
        Ability = ability;
    }

    public String getAbility() {
        return Ability;
    }

    @Override
    public void print() {
        System.out.println( " ability: " + getAbility() + "/n "
                + " growing up: " + getGrowingup() + "/n "
                + " age: " + getAge() + " /n "
                + " education: " + getEducation() + " /n "
                + " gender: " + getGender());

    }
}
