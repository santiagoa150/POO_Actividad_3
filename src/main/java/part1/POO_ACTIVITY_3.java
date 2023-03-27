package part1;

import java.util.Scanner;
import part1.exercise10.Exercise10Frame;
import part1.exercise18.Exercise18Frame;
import part1.exercise19.Exercise19Frame;
import part1.exercise22.Exercise22Frame;
import part1.exercise23.Exercise23Frame;
import part1.exercise40.Exercise40Frame;
import part1.exercise41.Exercise41Frame;
import part1.exercise7.Exercise7Frame;

public class POO_ACTIVITY_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("* Selecciona el ejercicio para ejecutar *");
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("Ejercicios disponibles (Ingrese un número entero):");
        System.out.println("* 7 - 10 - 18 - 19 - 22 - 23 - 40 - 41*");
        System.out.println("");

        POO_ACTIVITY_3.validateInt(sc);
        int exerciseNumber = sc.nextInt();
        switch (exerciseNumber) {
            case 7:
                Exercise7Frame frame7 = new Exercise7Frame();
                frame7.setVisible(true);
                break;
            case 10:
                Exercise10Frame frame10 = new Exercise10Frame();
                frame10.setVisible(true);
                break;
            case 18:
                Exercise18Frame frame18 = new Exercise18Frame();
                frame18.setVisible(true);
                break;
            case 19:
                Exercise19Frame frame19 = new Exercise19Frame();
                frame19.setVisible(true);
                break;
            case 22:
                Exercise22Frame frame22 = new Exercise22Frame();
                frame22.setVisible(true);
                break;
            case 23:
                Exercise23Frame frame23 = new Exercise23Frame();
                frame23.setVisible(true);
                break;
            case 40:
                Exercise40Frame frame40 = new Exercise40Frame();
                frame40.setVisible(true);
                break;
            case 41: 
                Exercise41Frame fram41 = new Exercise41Frame();
                fram41.setVisible(true);
                break;
            default:
                System.out.println("INVALID_NUMBER");
                System.out.println("TRY_AGAIN");
        }
    }

    public static void validateInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("¡ Por favor ingresa un número entero válido !");
            sc.nextLine();
        }
    }
}
