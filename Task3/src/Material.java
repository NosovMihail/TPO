import java.util.Objects;

public class Material {
    private String materialName;

    public  Material(String materialName){
        this.materialName = materialName;
    }

    public String getMaterialName() {
        return materialName;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass().equals(this.getClass())) return this.materialName.equals(((Material) o).getMaterialName());
        return false;
    }

}
