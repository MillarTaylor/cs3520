import java.text.DecimalFormat;
import java.util.Scanner;

public class GPS {
    public static void main(String[] args){
        GPS gps= new GPS();
       String city1=gps.getCity("first");
      double lat1=gps.getLat();
       double long1=gps.getLong();

        String city2=gps.getCity("second");
        double lat2=gps.getLat();
        double long2=gps.getLong();


        String city3=gps.getCity("third");
        double lat3=gps.getLat();
        double long3=gps.getLong();


        double dist1=gps.haversine(lat1,long1,lat2,long2);
        double dist2 = gps.haversine(lat2,long2,lat3,long3);
        double dist3 = gps.haversine(lat1,long1, lat3, long3);

        System.out.println("The Area of the Triangle is "+ gps.heronsFormula(dist1,dist2,dist3));



    }

        public double heronsFormula(double a,double b, double c){


        double s= (a+b+c)/2;
        double Area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return Area;
        }
        public double haversine(double lat1, double lon1, double lat2, double lon2){
        //earths radius
        final int R=6371;
        double dlat=Math.toRadians(lat2-lat1);
        double dlon=Math.toRadians(lon2-lon1);
            lat1 = Math.toRadians(lat1);
            lat2 = Math.toRadians(lat2);

            double a= Math.pow(Math.sin(dlat / 2),2) + Math.pow(Math.sin(dlon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
            double c= 2* Math.asin(Math.sqrt(a));

            DecimalFormat df = new DecimalFormat("#.#");
            return Math.round((R* c)*10)/10.0;



        }

    public String getCity(String citynum){
        Scanner in= new Scanner(System.in);


        System.out.println("Please enter the name of the "+ citynum + " city");
        return in.nextLine();


    }
    public Double getLat(){
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter the latitude of the city");
        return Double.parseDouble(in.nextLine());
    }
    public Double getLong(){


        Scanner in= new Scanner(System.in);

        System.out.println("Please enter the longitude of the city");
        return Double.parseDouble(in.nextLine());
    }





}
