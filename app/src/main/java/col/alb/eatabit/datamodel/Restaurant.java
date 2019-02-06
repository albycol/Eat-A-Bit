package col.alb.eatabit.datamodel;

import android.support.annotation.DrawableRes;

public class Restaurant {
    @DrawableRes private int image;
    private String name;
    private String address;
    private double minOrder;

    public Restaurant(int image, String name, String address, double minOrder) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.minOrder = minOrder;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMinOrder() {
        return minOrder;
    }

    public void setMinOrder(double minOrder) {
        this.minOrder = minOrder;
    }
}
