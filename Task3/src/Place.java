import java.util.ArrayList;

public class Place {
    private Color color;
    private ArrayList<Thing> things;
    private String name;

    public Place(String name){
        this.name = name;
        things = new ArrayList<>();
    }

    public void addThing(Thing thing){
        this.things.add(thing);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Thing> getThings() {
        return things;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void deleteThing(Thing thing) {
        things.remove(thing);
    }
}
