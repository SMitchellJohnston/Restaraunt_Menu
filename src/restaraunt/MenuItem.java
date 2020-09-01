package restaraunt;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private float price;
    private boolean isNew;

    public MenuItem(String name, String category, String description, float price){
        this.isNew = true;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String checkIfNew() {
        if(this.isNew) {
            return this.name + " is a new item.";
        }else{
            return this.name + " is NOT a new item.";
        }
    }
}
