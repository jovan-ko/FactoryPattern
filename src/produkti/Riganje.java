package produkti;

import interfejsi.Pogavstina;
import konstante.PogavstinaTip;

class Riganje extends Poganje implements Pogavstina {



    @Override
    public void pogavljenje() {
        this.setRadnja("Buaaaagh - Bljuc - ispovraca se");
    }

    @Override
    public String toString() {
        return "Riganje{" +
                "radnja='" + this.getRadnja() + '\'' +
                '}';
    }
}
