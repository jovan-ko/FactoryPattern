package produkti;

import interfejsi.AbstractFactoryIgracke;
import interfejsi.Igracke;
import konstante.Tip;

public class FabrikaAuticaSingleton implements AbstractFactoryIgracke {


    private static FabrikaAuticaSingleton fabrikaAuticaSingleton;

    private FabrikaAuticaSingleton() {
    }

    public static FabrikaAuticaSingleton makeFactoryObject(){
        if(fabrikaAuticaSingleton == null) {
            fabrikaAuticaSingleton = new FabrikaAuticaSingleton();
        }
        return fabrikaAuticaSingleton;
    }

    @Override
    public Igracke MakeToy(Tip tip) {

        Igracke obj = null;

        if (tip == Tip.FERARI) {
            obj = new Ferari();
            obj.igranje();
        } else if (tip == Tip.LAMBO) {
            obj = new Lamborgini();
            obj.igranje();
        }
        return obj;
    }
}
