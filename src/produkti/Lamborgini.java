package produkti;

import interfejsi.Igracke;

class Lamborgini extends Igracka implements Igracke {


    @Override
    public void igranje() {
        this.setRadnja("Wroom");
    }

    @Override
    public String toString() {
        return "Lambo{" +
                "radnja='" + this.getRadnja() + '\'' +
                '}';
    }
}
