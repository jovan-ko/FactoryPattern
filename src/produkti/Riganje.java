package produkti;

import interfejsi.Pogavstina;
import konstante.PogavstinaTip;

class Riganje implements Pogavstina {

    private String radnja;

    public String getRadnja() {
        return radnja;
    }

    public void setRadnja(String radnja) {
        this.radnja = radnja;
    }

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
