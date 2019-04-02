public class Lawn extends Chore {

    public int grassLength;
    public int lawnSize;

    public Lawn() {
        //intentional
    }

    public Lawn(int grassLength, int lawnSize) {
        this.grassLength = grassLength;
        this.lawnSize = lawnSize;
    }

    @Override
    public String toString() {
        return "Lawn{" +
                "grassLength=" + grassLength +
                ", lawnSize=" + lawnSize +
                '}';
    }

    public int getGrassLength() {
        return grassLength;
    }

    public void setGrassLength(int grassLength) {
        this.grassLength = grassLength;
    }

    public int getLawnSize() {
        return lawnSize;
    }

    public void setLawnSize(int lawnSize) {
        this.lawnSize = lawnSize;
    }
}
