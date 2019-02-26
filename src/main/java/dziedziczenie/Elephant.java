package dziedziczenie;

public class Elephant extends Animal
{
    public Elephant(String name) {
        super(name);
    }

    public void makeASound()
    {
        System.out.printf("Elephant %s make a sound\n", name);
    }
}
