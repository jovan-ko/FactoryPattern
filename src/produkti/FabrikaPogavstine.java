package produkti;

import interfejsi.AbstractFactoryProstacenje;
import interfejsi.Pogavstina;
import konstante.PogavstinaTip;

public class FabrikaPogavstine implements AbstractFactoryProstacenje {

    @Override
    public Pogavstina prostacenje(PogavstinaTip pogavstinaTip) {

        Pogavstina obj = null;

        if (pogavstinaTip == PogavstinaTip.PRDEZ) {
            obj = new Prdez();
            obj.pogavljenje();
        } else if (pogavstinaTip == PogavstinaTip.RIGANJE) {
            obj = new Riganje();
            obj.pogavljenje();
        }
        return obj;
    }
}
