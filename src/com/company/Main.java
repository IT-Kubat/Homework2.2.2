package com.company;

public class Main {

    public static Object createObject(String className) {
        switch (className) {
            case "Firstson":
                Firstson firstson = new Firstson("good", 18, "High", "Male", "Genius");
                firstson.print();
                return firstson;
            case "Seconddaughter":
                Seconddaughter seconddaughter = new Seconddaughter("best", 16, "notHigh", "Female", "Sport");
                seconddaughter.print();
                return seconddaughter;
            case "Thirdson":
                Thirdson thirdson = new Thirdson("middle", 10, "beginning", "Male", "Vocal");
                thirdson.print();
                return thirdson;


        }
              return createObject(className);

    }



    public static void main(String[] args) {

        createObject("Firstson");
        createObject("Seconddaughter");
        createObject("Thirdson");



    }
}
