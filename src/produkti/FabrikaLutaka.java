package produkti;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracke;
import konstante.Tip;

public class FabrikaLutaka implements AbstractFactoryIgracke {

    private static AbstractFactoryIgracke igracke;

    private FabrikaLutaka() {

    }

    public static AbstractFactoryIgracke makeFactoryObject() {
        if (igracke == null) {
            igracke = new FabrikaLutaka();
        }
        return igracke;
    }

    @Override
    public Igracke MakeToy(Tip tip) {
        if (tip == Tip.BARBIKA) {
            return new Barbi();
        }
        return null;
    }
}
