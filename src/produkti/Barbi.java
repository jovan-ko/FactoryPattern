package produkti;

import interfejsi.Igracke;

public class Barbi extends Igracka implements Igracke {

    @Override
    public void igranje() {
        this.setRadnja("Tra la la la, Ja sam Barbi u cvecu");
    }

    @Override
    public String toString() {
        return "Barbi{" + this.getRadnja() + "}";
    }
}
