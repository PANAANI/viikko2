// Joona Niemenmaa 16/01/2024 App.java
// A program that let's you play around with a hedgehog
package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        Hedgehog hedgehog = new Hedgehog();
        
        boolean exit = false;
        while (exit == false) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            if (scanner.hasNext()) {
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Mitä siili sanoo:");
                        String input = scanner.nextLine();
                        hedgehog.speak(input);
                        break;
                    case "2":
                        hedgehog = new Hedgehog();
                        System.out.println("Anna siilin nimi:");
                        String inputName = scanner.nextLine();
                        hedgehog.setName(inputName);
                        System.out.println("Anna siilin ikä:");
                        int age = Integer.parseInt(scanner.nextLine());
                        hedgehog.setAge(age);
                        break;
                    case "3":
                        System.out.println("Kuinka monta kierrosta?");
                        int iterations = Integer.parseInt(scanner.nextLine());
                        hedgehog.run(iterations);
                        break;
                    case "0":
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä"); 
                        break;
                }
            }
        }
    }
}
// EOF