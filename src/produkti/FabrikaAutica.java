package produkti;

import interfejsi.AbstractFactoryIgracke;
import konstante.Tip;

public class FabrikaAutica implements AbstractFactoryIgracke {

    private static AbstractFactoryIgracke igracke;

    private FabrikaAutica() {
    }

    public static synchronized AbstractFactoryIgracke makeFactoryObject() {
        if (igracke == null) {
            igracke = new FabrikaAutica();
        }
        return igracke;
    }

    @Override
    public Toy MakeToy(Tip tip) {
        switch(tip){
            case FERARI: return new Ferari();
            case LAMBO: return  new Lamborgini();
            default: throw new IllegalArgumentException("Wrong type");
        }
    }
}
