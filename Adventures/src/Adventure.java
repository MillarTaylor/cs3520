import java.util.Scanner;

public class Adventure {

    enum Directions{West,East,North,South;
    }
    private Scanner input;

    public static void main(String[] args) {

        Adventure adventure = new Adventure();


        System.out.println(adventure.getInput());


    }

    public Adventure() {

        input = new Scanner(System.in);
    }

//Scanner input = new Scanner(System.in);

    public String getInput() {

        System.out.println("Please input a Command");

        return input.nextLine();

    }



    public void parseInput(){







    }


}