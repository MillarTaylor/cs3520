import java.time.LocalTime;

public class WatchDog {
    private long endTime;
    private long startTime;

    public void WatchDog() {
        startTime = System.currentTimeMillis();
    }

    public void WatchDog(Long startTime) {

        this.startTime = startTime;

    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {

        return getEndTime()-getStartTime();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }
}
