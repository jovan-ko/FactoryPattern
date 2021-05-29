package produkti;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracke;
import konstante.Tip;

public class Fasada {
    private Igracke igracka;
    private FabrikaFabrika fabrikaFabrika;
    private AbstractFactoryIgracke factoryForCars;
    private AbstractFactoryIgracke factoryForDolls;

    public Fasada() {
        igracka = null;
        fabrikaFabrika = new FabrikaFabrika();
        factoryForCars = fabrikaFabrika.createFactory(Tip.AUTO);
        factoryForDolls = fabrikaFabrika.createFactory(Tip.LUTKA);
    }

    private Igracke getIgracka() {
        return igracka;
    }

    private void setIgracka(Igracke igracka) {
        this.igracka = igracka;
    }

    private FabrikaFabrika getFabrikaFabrika() {
        return fabrikaFabrika;
    }

    private AbstractFactoryIgracke getFactoryForCars() {
        return factoryForCars;
    }

    private AbstractFactoryIgracke getFactoryForDolls() {
        return factoryForDolls;
    }

    public Igracke createLambo() {
        this.setIgracka(getFactoryForCars().MakeToy(Tip.LAMBO));
        this.getIgracka().igranje();
        System.out.println(this.getIgracka());
        return this.getIgracka();
    }

    public Igracke createFerari() {
        this.setIgracka(getFactoryForCars().MakeToy(Tip.FERARI));
        this.getIgracka().igranje();
        System.out.println(this.getIgracka());
        return this.getIgracka();
    }

    public Igracke createBarbie() {
        this.setIgracka(getFactoryForDolls().MakeToy(Tip.BARBIKA));
        this.getIgracka().igranje();
        System.out.println(this.getIgracka());
        return this.getIgracka();
    }


}
