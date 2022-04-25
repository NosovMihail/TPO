import java.util.ArrayList;

public class ConnectedPlaces {
    private ArrayList<Connect> connectedPlaces;

    public ConnectedPlaces(){
        connectedPlaces = new ArrayList<>();
    }

    public void addConnection(Connect connection){
        connectedPlaces.add(connection);
    }

    public void addConnection(Place place1, Place place2){
        connectedPlaces.add(new Connect(place1, place2));
    }

    public ArrayList<Place> getConnectedPlaces(Place place){
        ArrayList<Place> connected = new ArrayList<>();
        connectedPlaces.forEach(connection -> {
            if(connection.getPlace1().equals(place)) connected.add(connection.getPlace2());
            if(connection.getPlace2().equals(place)) connected.add(connection.getPlace1());});
        return connected;
    }
}
