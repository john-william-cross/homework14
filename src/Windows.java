import java.util.List;

public class Windows extends Chores {

    public List<Integer> numOfWindows;
    public List<String> windowsLocation;
    public List<Integer> windowsCleanliness;

    public Windows() {
        //intentional
    }

    public Windows(List<Integer> numOfWindows, List<String> windowsLocation, List<Integer> windowsCleanliness) {
        this.numOfWindows = numOfWindows;
        this.windowsLocation = windowsLocation;
        this.windowsCleanliness = windowsCleanliness;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "numOfWindows=" + numOfWindows +
                ", windowsLocation=" + windowsLocation +
                ", windowsCleanliness=" + windowsCleanliness +
                '}';
    }

    public List<Integer> getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(List<Integer> numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public List<String> getWindowsLocation() {
        return windowsLocation;
    }

    public void setWindowsLocation(List<String> windowsLocation) {
        this.windowsLocation = windowsLocation;
    }

    public List<Integer> getWindowsCleanliness() {
        return windowsCleanliness;
    }

    public void setWindowsCleanliness(List<Integer> windowsCleanliness) {
        this.windowsCleanliness = windowsCleanliness;
    }
}
