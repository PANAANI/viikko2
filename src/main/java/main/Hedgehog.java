// Joona Niemenmaa 16/01/2024 Hedgehog.java
package main;

public class Hedgehog 
{
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }
    public void speak(String input) {
        String printout = "";
        switch (input) {
            case "":
                printout = "Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?";
                System.out.println(printout);
                break;
        
            default:
                printout = name + ": " + input;
                System.out.println(printout);
                break;
        }
        
    }
    public void run(int iterations) {
        String printout = name + " juoksee kovaa vauhtia!";
        for (int i = 0; i < iterations; i++) {
            System.out.println(printout);
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void setName(String newName) {
        name = newName;
    }
}
// EOF