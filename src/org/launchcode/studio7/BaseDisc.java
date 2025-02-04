package org.launchcode.studio7;

public class BaseDisc {

    private int storageCapacity;
    private String name;
    private String discType;
    private double thickness;

    public BaseDisc(int storageCapacity, String name, String discType) {
        this.storageCapacity = storageCapacity;
        this.name = name;
        this.discType = discType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
}
