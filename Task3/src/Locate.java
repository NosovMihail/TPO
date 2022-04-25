public class Locate {
    private Place place;
    private Thing thing;

    public Locate(Place place, Thing thing){
        this.place = place;
        this.thing = thing;
        place.addThing(thing);
        if(thing.getPlace() != null){
            thing.getPlace().deleteThing(thing);
        }
        thing.setPlace(place);
    }

    public Place getPlace() {
        return place;
    }

    public Thing getThing() {
        return thing;
    }
}
