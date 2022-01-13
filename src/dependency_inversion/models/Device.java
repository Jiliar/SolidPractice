package dependency_inversion.models;

import dependency_inversion.repository.IAction;

public class Device implements IAction {

    private String brand;
    private String type;

    public Device(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public Device() {}

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

    @Override
    public void plugIn() {
        System.out.println("¡Device is connected!");
    }
}
