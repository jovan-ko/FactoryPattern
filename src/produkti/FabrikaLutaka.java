package produkti;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracke;
import konstante.Tip;

public class FabrikaLutaka implements AbstractFactoryIgracke {

    private static AbstractFactoryIgracke abstractFactoryIgracke;

    private FabrikaLutaka() {

    }

    public static AbstractFactoryIgracke makeFactoryObject() {
        if (abstractFactoryIgracke == null) {
            abstractFactoryIgracke = new FabrikaLutaka();
        }
        return abstractFactoryIgracke;
    }

    @Override
    public Igracke MakeToy(Tip tip) {
        if (tip == Tip.BARBIKA) {
            return new Barbi();
        }
        return null;
    }
}
