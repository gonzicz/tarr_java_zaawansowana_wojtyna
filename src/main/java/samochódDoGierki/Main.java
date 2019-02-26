package samochódDoGierki;

public class Main
{
    public static void main(String[] args)
    {
        Track tor1 = new Track(100);
        Car car1 = new Car(tor1,0);
        Car car2 = new Car(tor1,10 );
        for (int i = 1; i <=10 ; i++) {
            car1.move(1);
        }
    }
}
