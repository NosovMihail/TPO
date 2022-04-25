public class Thing {
    private Color color;
    private Place place;
    private Material material;
    private String name;

    public Thing(String name){
        this.name = name;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Place getPlace() {
        return place;
    }

    public Material getMaterial() {
        return material;
    }
}
