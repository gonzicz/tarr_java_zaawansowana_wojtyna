package samochódDoGierki;
//ctrl+Q
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Track tor1 = new Track(100);       // utworzenie nowego toru o rozmiarze 100 (100 pozycji),
                                                // obiekt po którym jeżdzą auta
        Car car1 = new Car(tor1, 0);    // tworzenie obiektu (auta) na torze na pozycji 0
        Car car2 = new Car(tor1, 10);   // tworzenie obiektu (auta) na torze na pozycji 10
        System.out.println(tor1);               // wyświetlenie aktualnego stanu toru

        // pętla przemieszczająca 10 razy car1 o jedno pole
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(500);      // opóźnienie pół sekundy
            car1.move(1);         // przesunięce auta o jedno pole
            System.out.println(tor1);     // wyświetlenie aktualnego stanu toru
        }
    }
}
