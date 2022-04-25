public class Color {
    private String colorName;

    public Color(String colorName){
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass().equals(this.getClass())) return this.colorName.equals(((Color) o).getColorName());
        return false;
    }
}
