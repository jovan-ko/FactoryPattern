package produkti;

import interfejsi.AbstractFactoryIgracke;
import konstante.Tip;

public class FabrikaFabrika {

    public AbstractFactoryIgracke createFactory(Tip tip) {
        if (tip == Tip.LUTKA) {
            return FabrikaLutaka.makeFactoryObject();
        } else if (tip == Tip.AUTO) {
            return FabrikaAuticaSingleton.makeFactoryObject();
        }
        return null;
    }
}
