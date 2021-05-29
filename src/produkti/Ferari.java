package produkti;

import interfejsi.Igracke;

class Ferari extends Igracka implements Igracke {


    @Override
    public void igranje() {
        this.setRadnja("Brrrrrrm");
    }

    @Override
    public String toString() {
        return "Ferari{" +
                "radnja='" + this.getRadnja() + '\'' +
                '}';
    }
}
