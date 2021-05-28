package produkti;

import interfejsi.Pogavstina;
import konstante.PogavstinaTip;

class Prdez extends Poganje implements Pogavstina {



    @Override
    public void pogavljenje() {
        this.setRadnja("Prrrr - gru - upuva se i usmrdi");
    }

    @Override
    public String toString() {
        return "Prdez{" +
                "radnja='" + this.getRadnja() + '\'' +
                '}';
    }
}
