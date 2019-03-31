import java.util.List;

public class Dishes extends Chores {

    public List<String> dishType;
    public int numberOfDishes;

    public Dishes() {
        //intentional
    }

    public Dishes(List<String> dishType, int numberOfDishes) {
        this.dishType = dishType;
        this.numberOfDishes = numberOfDishes;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "dishType=" + dishType +
                ", numberOfDishes=" + numberOfDishes +
                '}';
    }

    public List<String> getDishType() {
        return dishType;
    }

    public void setDishType(List<String> dishType) {
        this.dishType = dishType;
    }

    public int getNumberOfDishes() {
        return numberOfDishes;
    }

    public void setNumberOfDishes(int numberOfDishes) {
        this.numberOfDishes = numberOfDishes;
    }
}
