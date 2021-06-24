package produkti;

public abstract class Toy {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();

    @Override
    public String toString() {
        return getName();
    }
}
