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

                switch(ulaz) {
                    case 1:
                        ponuda.createFerari();
                        break;
                    case 2:
                        ponuda.createLambo();
                        break;
                    case 3:
                        ponuda.createBarbie();
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Uneti parametar nije broj, molim unesite broj");
            }

        }

    }

}
