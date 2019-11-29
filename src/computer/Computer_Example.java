package computer;

import java.util.Scanner;

/**
 * @author agonzalezacevedo
 */
public class Computer_Example {

    /**
     * Principal method that runs the program
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Computer comp = new Computer("Inalambrico", "Samsung", 20.0f, 5, 1);
        comp.show();
        System.out.print("Mouse type:");
        String type = sc.nextLine();
        System.out.print("Screen brand:");
        String brand = sc.next();
        System.out.print("How many inches does the screen have?:");
        float inches = sc.nextFloat();
        System.out.print("CPU Speed:");
        int speed = sc.nextInt();
        System.out.print("Memory:");
        int memory = sc.nextInt();
        Computer comp2 = new Computer(type, brand, inches, speed, memory);
        comp2.show();

    }

}
