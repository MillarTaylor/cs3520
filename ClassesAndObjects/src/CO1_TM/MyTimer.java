import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MyTimer {
    public WatchDog watchDog = new WatchDog();

    public int randomArray[] = new int[100000];


    public static void main(String[] args) {
        MyTimer timer = new MyTimer();


        timer.selectionSort();

        // timer.print();
        System.out.println(timer.getTotalTime());
        System.out.print("it took ");
        System.out.printf("%.2f", timer.getTotalTime());
        System.out.print(" Milliseconds to sort");


    }

    public MyTimer() {
        fillArray();
    }

    public void print() {


        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }

    }


    public double getTotalTime() {

        // return TimeUnit.MILLISECONDS.toSeconds(watchDog.getElapsedTime());
        return (double) watchDog.getElapsedTime() / 1000;
    }

    public void fillArray() {


        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100000);
        }


    }

    public void selectionSort() {
        watchDog.start();
        for (int i = 0; i < randomArray.length - 1; i++) {

            int currentIndex = i;
            for (int j = i + 1; j < randomArray.length; j++) {

                if (randomArray[j] < randomArray[currentIndex])
                    currentIndex = j;
            }
            int number = randomArray[currentIndex];
            randomArray[currentIndex] = randomArray[i];
            randomArray[i] = number;


        }
        watchDog.stop();
    }

}
