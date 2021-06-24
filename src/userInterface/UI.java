package userInterface;


import konstante.Tip;
import produkti.FabrikaFabrika;
import produkti.Playing;

import java.util.Scanner;

public class UI {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int ulaz = 0;

        System.out.println("Dobrodosli! Dobroidosli!");
        while (ulaz < 4) {
            System.out.println("");
            System.out.println("Kojom igrackom zelite da se igrate?");
            System.out.println("Za ferari unesite 1");
            System.out.println("Za lambo unesite 2");
            System.out.println("Za Barbi unesite 3");
            System.out.println("Za izlaz iz programa unesite 4");
            try {
                ulaz = Integer.parseInt(scanner.next());
                Playing playing = new Playing();

                switch(ulaz) {
                    case 1:
                        playing.play(Tip.FERARI);
                        break;
                    case 2:
                        playing.play(Tip.LAMBO);
                        break;
                    case 3:
                        playing.play(Tip.BARBIKA);
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Uneti parametar nije broj, molim unesite broj");
            }

        }
        scanner.close();

    }

}
