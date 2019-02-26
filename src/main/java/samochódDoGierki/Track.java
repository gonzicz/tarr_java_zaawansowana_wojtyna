package samochódDoGierki;

/**
 * ctr+shift+F12
 */

// klasa Track służy do stworzenia toru po której przemieszczają się auta
public class Track {
    private Car[] cars;     // deklaracja tablicy, któa może zawierać samochody, jeśli na pozycji jest null to na tej
    // pozycji nie ma samochodu, a jeśli nie jest nulll to znajduje się tam samochód

    public Track(int size) {            // konstruktor toru, który tworzy tor o podanej długości
        this.cars = new Car[size];      // alokacja pamięci na tablicę o rozmiarze size, wszystkie elementy tablicy domyślnie są null
    }

    @Override   // implementacja zamiany tor na stringa w celu przedstawiwnia jej graficznie
    public String toString() {
        StringBuilder viewBuilder = new StringBuilder();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                viewBuilder.append("_");
            } else {
                viewBuilder.append("C");
            }
        }
        return viewBuilder.toString();
    }

    // metoda ustawiająca nam samochód na danej pozycji
    public void setCarAt(int position, Car car) {
        cars[position] = car;
    }

    // metoda sprawdzająca czy na nowej pozycji jest samochód
    public boolean isCarAt(int newPosition) {
//        if(cars[newPosition] == null)
//        {
//            return false;                     // <-- inne rozwiązanie tego samego
//        else
//        {
//            return true;
//        }
        return cars[newPosition] != null;
    }
}
