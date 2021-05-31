package builderPattern;

import Igre.OdlazakUSoping;
import Igre.Trke;
import interfejsi.Igra;

public class IgranjeBilder {
    private PripremaZaIgranje pripremaZaIgranje;

    public IgranjeBilder() {
        this.pripremaZaIgranje = new PripremaZaIgranje();
    }

    public void muskeIgre(){
        Igra igra = new Trke();
        this.pripremaZaIgranje.chooseGame(igra);
        this.pripremaZaIgranje.addIgracka();
        System.out.println("Igra sa igrackama: " + pripremaZaIgranje.getIgracke() + " , pravila igre: " + pripremaZaIgranje.getIgra().igraj());
    }

    public void zenskeIgre(){
        Igra igra = new OdlazakUSoping();
        pripremaZaIgranje.chooseGame(igra);
        pripremaZaIgranje.addIgracka();
        System.out.println("Igra sa igrackama: " + pripremaZaIgranje.getIgracke() + " , pravila igre: " + pripremaZaIgranje.getIgra().igraj());
    }
}
