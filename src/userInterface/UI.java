package userInterface;

import interfejsi.Pogavstina;
import konstante.PogavstinaTip;
import produkti.FabrikaPogavstine;

import java.util.Scanner;

public class UI {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int ulaz = 0;

        System.out.println("Dobrodosli! Dobroidosli!");
        while(ulaz != 3) {
            System.out.println("");
            System.out.println("Kakvu poganost zelite da napravite?");
            System.out.println("Za prdenje unesite 1");
            System.out.println("Za riganje unesite 2");
            System.out.println("Za izlaz iz programa unesite 3");
            try{
                ulaz = Integer.parseInt(scanner.next());
                FabrikaPogavstine fabrikaPogavstine = new FabrikaPogavstine();

                Pogavstina pogavstina = null;

                if(ulaz == 1) {
                    pogavstina = fabrikaPogavstine.prostacenje(PogavstinaTip.PRDEZ);
                    System.out.println(pogavstina);
                }else if(ulaz == 2) {
                    pogavstina = fabrikaPogavstine.prostacenje(PogavstinaTip.RIGANJE);
                    System.out.println(pogavstina);
                }else if(ulaz > 3){
                    System.out.println("Za sada imamo dva proizvoda samo. Pisite nasem PR timu da saznate kada cemo dodati nove proizvode");
                }
            } catch (NumberFormatException e) {
                System.out.println("Uneti parametar nije broj, molim unesite broj");
            }

        }

    }

}
