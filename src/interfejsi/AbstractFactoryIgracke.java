package interfejsi;

import konstante.Tip;
import produkti.Toy;

public interface AbstractFactoryIgracke {

    public Toy MakeToy(Tip tip);
}
