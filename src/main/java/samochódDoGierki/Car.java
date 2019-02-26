package samochódDoGierki;

// klasa modelująća samochód
public class Car {
    private String color;       // deklaracja pól opisujących atrybuty samochodu
    private Wheel[] kola;
    private Engine silnik;
    private int power;
    private Track track;
    private int position;

    public Car(Track track, int position) {     // konstrukktor klasy Car, który przyjmuje argumenty tor i pozycja
        this.track = track;                     // this - referncja do TEGO (aktualnego) obiektu
        this.position = position;
        track.setCarAt(position, this);     // samochód który strzorzymy dodajemy do toru na danej pozycji
    }


    // metoda przesuwająca nam auto o podany dystans
    public void move(int distance) {
        // obliczenie na jakiej pozycji znalazłby się samochód po przejechaniu danego dystansu
        int newPosition = position + distance;
        // detekcja kolizji, srawdza czy na tej pozycji na którą by się przemieszczał nie znajnduje się inne auto
        if (track.isCarAt(newPosition)) {
            System.out.println("\nBOOM!!!!!");
            // jeśłi jest kolizja , rozwala samochody czyli usuwa je z toru
            track.setCarAt(position, null);     // ten
            track.setCarAt(newPosition, null);  // ten który już jest na nowej pozycji
        } else {

            System.out.printf("Samochód został przestawiony z pozycji %d na pozycję %d\n",
                    position, newPosition);
            // jeśli nie ma kolizji, to przemieszczamy samochód
            track.setCarAt(position, null);         // na starej pozycji stawiamy null - usuwamy auto
            track.setCarAt(newPosition, this);      // umieszczany samochów na nowej pozycji na torze
            position = newPosition;                     // aktualizujemy obecną pozycję samochodu, ( będzeie potzrebny do
                                                        // obliczeń kolejnego ruchu)
        }
    }
}
