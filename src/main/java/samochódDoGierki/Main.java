package samochódDoGierki;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Track tor1 = new Track(100);
        Car car1 = new Car(tor1,0);
        Car car2 = new Car(tor1,10 );
        System.out.println(tor1);
        for (int i = 1; i <=10 ; i++)
        {
            Thread.sleep(500);  // opóźnienie pół sekundy
            car1.move(1);
            System.out.println(tor1);
        }
    }
}
