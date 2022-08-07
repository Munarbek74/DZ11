package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fish fish = new Fish();
        fish.setLength(40);
        fish.setName("Судак");
        fish.setWeight(1.5);

        String name = fish.getName();
        int lenght = fish.getLength();
        double weight = fish.getWeight();
        System.out.println("Рыба " + name + " в основном их длина достигает " + lenght + " см " + " вес составляет " + weight + " кг" );

        Fish fish1 = new Fish();
        fish1.setLength(64);
        fish1.setName("Скумбрия");
        fish1.setWeight(2.9);

        String name1 = fish1.getName();
        int lenght1 = fish1.getLength();
        double weight1 = fish1.getWeight();
        System.out.println("Рыба " + name1 + " в основном их длина достигает " + lenght1 + " см " + " вес составляет " + weight1 + " кг" );

        System.out.println();
        Parrot parrot = new Parrot();
        parrot.setName("Неразлучники");
        parrot.setAge(25);
        parrot.setColor("Красный");
        parrot.setWeight(2);
        parrot.setDescription("очень умные, проворные и хитрые птицы, недооценивать их поведение и реакцию не стоит");

        String name2 = parrot.getName();
        int age2 = parrot.getAge();
        int weight2 = parrot.getWeight();
        String color2 = parrot.getColor();
        String description = parrot.getDescription();
        System.out.println("Попугай " + name2 + " " + description + " возраст их достигает до " + age2 + " лет " + " основной цвет перьев " + color2 + " вес достигает " + weight2 +" кг");

        Parrot parrot1 = new Parrot();
        parrot1.setName("Какаду");
        parrot1.setAge(45);
        parrot1.setColor("зеленый");
        parrot1.setWeight(1);
        parrot1.setDescription(" отличительной особенностью данного вида попугаев является их необычный клюв. Он массивный, длинный и очень загнутый");

        String name3 = parrot1.getName();
        int age3 = parrot1.getAge();
        int weight3 = parrot1.getWeight();
        String color3 = parrot1.getColor();
        String description1 = parrot1.getDescription();
        System.out.println("Попугай " + name3 + " " + description1 + " возраст их достигает до " + age3 + " лет " + " основной цвет перьев " + color3 + " вес достигает " + weight3 +" кг");

        System.out.println();
        Cat cat = new Cat();
        cat.setName("Маруся");
        cat.setAge(3);
        cat.setBreed("Сиамская");
        cat.setWeight(4);
        cat.setColor("Серый");

        String name4 = cat.getName();
        int age4 = cat.getAge();
        String breed = cat.getBreed();
        int weight4 = cat.getWeight();
        String color4 = cat.getColor();
        System.out.println("Котенок " + name4 + " ей " + age4 + " года " + " у нее цвет " + color4 + " порода " + breed + " обычно они бывают весом " + weight4 + " кг");

        Cat cat1 = new Cat();
        cat1.setName("Киса");
        cat1.setAge(2);
        cat1.setBreed("Дикая");
        cat1.setWeight(5);
        cat1.setColor("Черный");

        String name5 = cat1.getName();
        int age5 = cat1.getAge();
        String breed1 = cat1.getBreed();
        int weight5 = cat1.getWeight();
        String color5 = cat1.getColor();
        System.out.println("Котенок " + name5 + " ей " + age5 + " года " + " у нее цвет " + color5 + " порода " + breed1 + " обычно они бывают весом " + weight5 + " кг");

        System.out.println();
        Dog dog = new Dog();
        dog.setName("Жучка");
        dog.setAge(5);
        dog.setBreed("Овчарка");
        dog.setWeight(8);
        dog.setColor("Желтый");

        String name6 = dog.getName();
        int age6 = dog.getAge();
        String breed3 = dog.getBreed();
        int weight6 = dog.getWeight();
        String color6 = dog.getColor();
        System.out.println("Собака " + name6 + " ей " + age6 + " лет " + " у нее цвет " + color6 + " порода " + breed3 + " обычно они бывают весом " + weight6 + " кг");

        Dog dog1 = new Dog();
        dog1.setName("Шарик");
        dog1.setAge(8);
        dog1.setBreed("Хаски");
        dog1.setWeight(12);
        dog1.setColor("Пестрая");

        String name7 = dog1.getName();
        int age7 = dog1.getAge();
        String breed4 = dog1.getBreed();
        int weight7 = dog1.getWeight();
        String color7 = dog1.getColor();
        System.out.println("Собака " + name7 + " ей " + age7 + " года " + " у нее цвет " + color7 + " порода " + breed4 + " обычно они бывают весом " + weight7 + " кг");
    }
}
