public class Zodiac{

public static void main(String [] args){
//for(String s: args){
//System.out.println(s);}

System.out.println("Your Zodiac is a " + getZodiac(Integer.parseInt(args[0])));




}


public static String getZodiac(int year){
int month = year%12;

switch(month){
case 0: return "Monkey";
case 1: return "Rooster";
case 2: return "Dog";
case 3: return "Pig";
case 4: return "Rat";
case 5: return "ox";
case 6: return "Tiger";

case 7: return "Rabbit";

case 8: return "Dragon";

case 9: return "Snake";
case 10: return "Horse";
case 11: return "monkey";
default: return "Invalid Input";
}
}

}

