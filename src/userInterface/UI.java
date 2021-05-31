package userInterface;

import builderPattern.IgranjeBilder;

import java.util.Scanner;

public class UI {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int ulaz = 0;

        System.out.println("Dobrodosli! Dobroidosli!");
        while (ulaz != 3) {
            System.out.println("");
            System.out.println("Kojih igara zelite da se igrate?");
            System.out.println("Za muske igre unesite 1");
            System.out.println("Za zenske igre unesite 2");
            System.out.println("Za izlaz iz programa unesite 3");
            try {
                ulaz = Integer.parseInt(scanner.next());

                IgranjeBilder igranjeBilder = new IgranjeBilder();

                switch(ulaz) {
                    case 1:
                        igranjeBilder.muskeIgre();
                        break;
                    case 2:
                        igranjeBilder.zenskeIgre();
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Uneti parametar nije broj, molim unesite broj");
            }

        }

    }

}
