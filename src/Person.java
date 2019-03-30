public class Person {

    private String name;
    private int energyLevel;
    private boolean isAvailable;

    public Person() {
        //intentional
    }

    public Person(String name, int energyLevel, boolean isAvailable) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.isAvailable = isAvailable;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", energyLevel=" + energyLevel +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
