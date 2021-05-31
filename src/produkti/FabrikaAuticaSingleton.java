package produkti;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracka;
import konstante.Tip;

public class FabrikaAuticaSingleton implements AbstractFactoryIgracke {

    private static AbstractFactoryIgracke igracke;

    private FabrikaAuticaSingleton() {
    }

    public static AbstractFactoryIgracke makeFactoryObject() {
        if (igracke == null) {
            igracke = new FabrikaAuticaSingleton();
        }
        return igracke;
    }

    @Override
    public Igracka MakeToy(Tip tip) {

        Igracka obj = null;

        if (tip == Tip.FERARI) {
            obj = new Ferari();

        } else if (tip == Tip.LAMBO) {
            obj = new Lamborgini();

        }
        return obj;
    }
}
