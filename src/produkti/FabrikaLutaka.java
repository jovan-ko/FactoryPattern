package produkti;

import interfejsi.AbstractFactoryIgracke;
import konstante.Tip;

public class FabrikaLutaka implements AbstractFactoryIgracke {

    private static AbstractFactoryIgracke abstractFactoryIgracke;

    private FabrikaLutaka() {

    }

    public static synchronized AbstractFactoryIgracke makeFactoryObject() {
        if (abstractFactoryIgracke == null) {
            abstractFactoryIgracke = new FabrikaLutaka();
        }
        return abstractFactoryIgracke;
    }

    @Override
    public Toy MakeToy(Tip tip) {
        if (tip == Tip.BARBIKA) {
            return new Barbi();
        } else {
            throw new IllegalArgumentException("Wrong type, need BARBIKA");
        }
    }
}
