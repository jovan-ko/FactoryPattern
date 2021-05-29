package produkti;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracke;
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
    public Igracke MakeToy(Tip tip) {

        Igracke obj = null;

        if (tip == Tip.FERARI) {
            obj = new Ferari();

        } else if (tip == Tip.LAMBO) {
            obj = new Lamborgini();

        }
        return obj;
    }
}
