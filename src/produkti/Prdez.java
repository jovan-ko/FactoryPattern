package produkti;

import interfejsi.Pogavstina;
import konstante.PogavstinaTip;

class Prdez implements Pogavstina {

    private String radnja;

    public String getRadnja() {
        return radnja;
    }

    public void setRadnja(String radnja) {
        this.radnja = radnja;
    }

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
