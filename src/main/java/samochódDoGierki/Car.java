package samochódDoGierki;

public class Car
{
    private String color;
    private Wheel[] kola;
    private Engine silnik;
    private int power;
    private Track track;
    private int position;

    public Car(Track track, int position)
    {
        this.track = track;
        this.position = position;
        track.setCarAt(position, this);
    }

    public void move(int distance)
    {
        int newPosition = position + distance;
        if(track.isCarAt(newPosition)){
            System.out.println("\nBOOM!!!!!");
            track.setCarAt(position, null);
            track.setCarAt(newPosition, null);
        } else {
            System.out.printf("\nSamochód został przestawiony z pozycji %d na pozycję %d",
                    position, newPosition);
            track.setCarAt(position, null);
            track.setCarAt(newPosition, this);
            position = newPosition;
        }

    }
}
