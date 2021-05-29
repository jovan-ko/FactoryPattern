package userInterface;

import produkti.Fasada;

import java.util.Scanner;

public class UI {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int ulaz = 0;

        System.out.println("Dobrodosli! Dobroidosli!");
        while (ulaz != 4) {
            System.out.println("");
            System.out.println("Sa kojom igračkom želite da se igrate?");
            System.out.println("Za Ferari unesite 1");
            System.out.println("Za Lambo unesite 2");
            System.out.println("Za Barbiku unesite 3");
            System.out.println("Za izlaz iz programa unesite 4");
            try {
                ulaz = Integer.parseInt(scanner.next());

                Fasada ponuda = new Fasada();

                if (ulaz == 1) {
                    ponuda.createFerari();
                } else if (ulaz == 2) {
                    ponuda.createLambo();
                } else if (ulaz == 3) {
                    ponuda.createBarbie();
                } else if (ulaz > 4) {
                    System.out.println("Za sada imamo tri proizvoda samo. Pisite nasem PR timu da saznate kada cemo dodati nove proizvode");
                }
            } catch (NumberFormatException e) {
                System.out.println("Uneti parametar nije broj, molim unesite broj");
            }

        }

    }

}
