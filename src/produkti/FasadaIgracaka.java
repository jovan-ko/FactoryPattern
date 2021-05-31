package produkti;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracka;
import konstante.Tip;

public class FasadaIgracaka {
    private Igracka igracka;
    private FabrikaFabrika fabrikaFabrika;
    private AbstractFactoryIgracke factoryForCars;
    private AbstractFactoryIgracke factoryForDolls;

    public FasadaIgracaka() {
        igracka = null;
        fabrikaFabrika = new FabrikaFabrika();
        factoryForCars = fabrikaFabrika.createFactory(Tip.AUTO);
        factoryForDolls = fabrikaFabrika.createFactory(Tip.LUTKA);
    }

    private Igracka getIgracka() {
        return igracka;
    }

    private void setIgracka(Igracka igracka) {
        this.igracka = igracka;
    }

    private AbstractFactoryIgracke getFactoryForCars() {
        return factoryForCars;
    }

    private AbstractFactoryIgracke getFactoryForDolls() {
        return factoryForDolls;
    }

    public Igracka createLambo() {
        this.setIgracka(getFactoryForCars().MakeToy(Tip.LAMBO));
        this.getIgracka().name();
        return this.getIgracka();
    }

    public Igracka createFerari() {
        this.setIgracka(getFactoryForCars().MakeToy(Tip.FERARI));
        this.getIgracka().name();
        return this.getIgracka();
    }

    public Igracka createBarbie() {
        this.setIgracka(getFactoryForDolls().MakeToy(Tip.BARBIKA));
        this.getIgracka().name();
        return this.getIgracka();
    }


}
