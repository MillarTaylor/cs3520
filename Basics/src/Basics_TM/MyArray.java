import java.util.*;

public class MyArray {
    public static void main(String[] args) {
        try {

            System.out.println(args.length);
            if (args.length != 2) {
                throw new IllegalArgumentException();
            } else {
                MyArray obj = new MyArray();
                final int n = Integer.parseInt(args[0]);
                final int r = Integer.parseInt(args[1]);
                ArrayList<Integer> randomNumbers = obj.noDuplicatesArray(n, r);


                //System.out.println(testDuplicates(randomNumbers));
                for(int i:randomNumbers)
                    System.out.print(i + " ");
                System.out.print("\n");
                System.out.println("Average:" + obj.getAverage(randomNumbers));
                System.out.println("Standard deviation:" + obj.getStdDev(randomNumbers));


            }
        } catch (Exception e) {

            System.out.println("invalid number of commandline arguements, the correct number is 2");
        }


    }

    //Function: noDuplicatesArray

    //Returns: Integer
    //Purpose: generate the average number in a list of random numbers
    public ArrayList<Integer> noDuplicatesArray(int n, int r) {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {

            int random = rand.nextInt(r);

            if (!randomNumbers.contains(random)) {


                randomNumbers.add(random);
            } else {
                i--;
            }

        }
        // System.out.println(Boolean.toString(testDuplicates(randomNumbers)));

        return randomNumbers;
    }

    //Function: getAverage
    //Returns: Integer
    //Purpose: generate the average number in a list of random numbers
    public Integer getAverage(ArrayList<Integer> randomNumbers) {

        int total = 0;

        for (int i : randomNumbers) {

            total += i;
        }

        int average = total / randomNumbers.size();
        return average;

    }


    //Function: getStdDev
    //Returns: standard Deviation
    //Purpose: generate the standard deviation in a list of random numbers
    public int getStdDev(ArrayList<Integer> randomNumbers) {
        int mean = getAverage(randomNumbers);
        int stdDev = 0;

        for (int i : randomNumbers) {

            stdDev += (i - mean) ^ 2;

        }
        return (int) Math.sqrt(stdDev / randomNumbers.size());


    }


    public static boolean testDuplicates(ArrayList<Integer> randomNumbers) {
        Set<Integer> chunk = new HashSet<Integer>();
//System.out.println(Arrays.toString(randomNumbers.toArray()));

        for (int i : randomNumbers) {
            if (chunk.contains(i)) return true;
            chunk.add(i);

        }

        return false;


    }


}
