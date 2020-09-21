package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            String animal;
            System.out.print("Indtast dyr her: ");
            animal = input.next();

            //System.out.print(animal);

            switch (animal) {
                case "Dog":
                    System.out.println("Woof");
                    break;
                case "Cat":
                    System.out.println("Meow");
                    break;
                case "Cow":
                    System.out.println("Muh");
                    break;
                case "Lion":
                    System.out.println("Roar");
                    break;
                case "Sheep":
                    System.out.println("Bah");
                    break;
                case "duck", "Duck":
                    System.out.println("Quack");
                    break;
                default:
                    System.out.println("?");


            }


        }
    }
}
