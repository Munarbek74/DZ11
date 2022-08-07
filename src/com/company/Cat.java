package com.company;

public class Cat {
    private String color;
    private int weight;
    private String breed;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            this.age = age;
        } else {
            System.out.println("Возраст кошки не может " + age +" лет");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String  color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
