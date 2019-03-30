public class Chores {

    public String mowLawn;
    public String doDishes;
    public String washWindows;

    public Chores() {
        //intentional
    }

    public Chores(String mowLawn, String doDishes, String washWindows) {
        this.mowLawn = mowLawn;
        this.doDishes = doDishes;
        this.washWindows = washWindows;
    }


    @Override
    public String toString() {
        return "Chores{" +
                "mowLawn='" + mowLawn + '\'' +
                ", doDishes='" + doDishes + '\'' +
                ", washWindows='" + washWindows + '\'' +
                '}';
    }

    public String getMowLawn() {
        return mowLawn;
    }

    public void setMowLawn(String mowLawn) {
        this.mowLawn = mowLawn;
    }

    public String getDoDishes() {
        return doDishes;
    }

    public void setDoDishes(String doDishes) {
        this.doDishes = doDishes;
    }

    public String getWashWindows() {
        return washWindows;
    }

    public void setWashWindows(String washWindows) {
        this.washWindows = washWindows;
    }
}
