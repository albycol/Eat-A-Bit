package col.alb.eatabit.datamodel;

public class FoodMenu {


    private String nameFood;
    private String description;
    private double price;

    public FoodMenu(String nameFood, String description, double price) {
        this.nameFood = nameFood;
        this.description = description;
        this.price = price;
    }

    public String getNameFood() {
        return nameFood;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}


