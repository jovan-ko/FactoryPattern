package produkti;

import interfejsi.AbstractFactoryIgracke;
import konstante.Tip;
import org.jetbrains.annotations.NotNull;

public class FabrikaFabrika {

    public AbstractFactoryIgracke createFactory(@NotNull Tip tip) {
        switch(tip){
            case LUTKA: return FabrikaLutaka.makeFactoryObject();
            case AUTO: return FabrikaAuticaSingleton.makeFactoryObject();
        }
        return null;
    }
}
