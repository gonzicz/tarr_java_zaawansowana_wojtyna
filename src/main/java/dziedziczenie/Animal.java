package dziedziczenie;

public class Animal
{
    /**
     * "#" - oznacza protected
     * "-" - oznacza private
     * "+" - oznacza public
     */
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void move()
    {
        System.out.println("Animal moves");
    }

    public void eat()
    {
        System.out.println("Animal eats");
    }
}
