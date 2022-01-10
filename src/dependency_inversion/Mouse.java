package dependency_inversion;

public class Mouse {

    private String brand;
    private String type;

    public Mouse(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public Mouse() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" + "brand='" + brand + '\'' + ", type='" + type + '\'' + '}';
    }

    public void plugIn(){
        System.out.println("¡Mouse is connected!");
    }
}
