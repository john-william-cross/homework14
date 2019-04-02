import java.util.List;

public class ChoreList {

    private List<String> choreType;
    private List<String> choreDoer;

    public ChoreList() {
        //intentional
    }

    public ChoreList(List<String> choreType, List<String> choreDoer) {
        this.choreType = choreType;
        this.choreDoer = choreDoer;
    }

    @Override
    public String toString() {
        return "ChoreList{" +
                "choreType=" + choreType +
                ", choreDoer=" + choreDoer +
                '}';
    }

    public List<String> getChoreType() {
        return choreType;
    }

    public void setChoreType(List<String> choreType) {
        this.choreType = choreType;
    }

    public List<String> getChoreDoer() {
        return choreDoer;
    }

    public void setChoreDoer(List<String> choreDoer) {
        this.choreDoer = choreDoer;
    }
}
