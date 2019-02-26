package samochódDoGierki;


/**
 * ctr+shift+F12
 */
public class Track {
    private Car[] cars;

    public Track(int size) {
        this.cars = new Car[size];
    }

    public void setCarAt(int position, Car car) {
        cars[position] = car;
    }


    public boolean isCarAt(int newPosition) {
//        if(cars[newPosition] == null)
//        {
//            return false;                     // <-- inne rozwiązanie
//        }
//        else
//        {
//            return true;
//        }
        return cars[newPosition] != null;
    }
}
