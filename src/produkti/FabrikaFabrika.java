package produkti;

import interfejsi.AbstractFactoryIgracke;
import konstante.Tip;
import org.jetbrains.annotations.NotNull;

public class FabrikaFabrika {

    public static AbstractFactoryIgracke createFactory(@NotNull Tip tip) {

        switch(tip){
            case LUTKA: return FabrikaLutaka.makeFactoryObject();
            case AUTO: return FabrikaAutica.makeFactoryObject();
            default: throw new IllegalArgumentException("Unknown type, use LUTKA or AUTO");
        }

    }
}
