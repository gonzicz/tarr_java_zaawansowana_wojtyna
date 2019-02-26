package dziedziczenie;

public class Parrot extends Animal
{
    public Parrot() {
        super("Polly")
    }

    public Parrot(String name) {
        super(name);
    }

    public void talk()
    {
        System.out.println("Parrot talks");
    }

    @Override
    public void move() {
        System.out.println("Parrot fly");
    }
}
