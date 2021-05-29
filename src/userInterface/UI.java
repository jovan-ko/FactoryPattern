package userInterface;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracke;
import konstante.Tip;
import produkti.FabrikaAuticaSingleton;

import java.util.Scanner;

public class UI {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int ulaz = 0;

        System.out.println("Dobrodosli! Dobroidosli!");
        while (ulaz != 3) {
            System.out.println("");
            System.out.println("Sa kojom igračkom želite da se igrate?");
            System.out.println("Za Ferari unesite 1");
            System.out.println("Za Lambo unesite 2");
            System.out.println("Za izlaz iz programa unesite 3");
            try {
                ulaz = Integer.parseInt(scanner.next());
                AbstractFactoryIgracke factory = FabrikaAuticaSingleton.makeFactoryObject();

                Igracke igracke = null;

                if (ulaz == 1) {
                    igracke = factory.MakeToy(Tip.FERARI);
                    System.out.println(igracke);
                } else if (ulaz == 2) {
                    igracke = factory.MakeToy(Tip.LAMBO);
                    System.out.println(igracke);
                } else if (ulaz > 3) {
                    System.out.println("Za sada imamo dva proizvoda samo. Pisite nasem PR timu da saznate kada cemo dodati nove proizvode");
                }
            } catch (NumberFormatException e) {
                System.out.println("Uneti parametar nije broj, molim unesite broj");
            }

        }

    }

}
