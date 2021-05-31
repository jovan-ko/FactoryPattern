package builderPattern;

import Igre.MuskeIgre;
import Igre.Trke;
import interfejsi.Igra;
import interfejsi.Igracka;
import produkti.FasadaIgracaka;

import java.util.ArrayList;

public class PripremaZaIgranje {

    private ArrayList<Igracka> igracke;
    private Igra igra;

    public PripremaZaIgranje(){
        this.igracke = new ArrayList<>();
        this.igra = new Trke();
    }

    public void chooseGame(Igra igra){
        this.igra = igra;
    }

    public void addIgracka(){
        FasadaIgracaka fasadaIgracaka = new FasadaIgracaka();
        if(getIgra() instanceof MuskeIgre) {
            igracke.add(fasadaIgracaka.createFerari());
            igracke.add(fasadaIgracaka.createLambo());
        } else {
            igracke.add(fasadaIgracaka.createFerari());
            igracke.add(fasadaIgracaka.createBarbie());
        }
    }

    public ArrayList<Igracka> getIgracke() {
        return igracke;
    }

    public void setIgracke(ArrayList<Igracka> igracke) {
        this.igracke = igracke;
    }

    public Igra getIgra() {
        return igra;
    }

}
