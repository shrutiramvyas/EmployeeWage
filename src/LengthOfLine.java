import java.util.Scanner;
import java.lang.Math;

public class LengthOfLine {
    public static double CheckLine(){
        Scanner line = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2 coordinates");
        int x1=line.nextInt();
        int y1=line.nextInt();
        int x2=line.nextInt();
        int y2=line.nextInt();
        double lengthofline = Math.floor(Math.sqrt((x2-x1)*2+(y2-y1)*2));
        return lengthofline;
    }
    public static void main(String[] args) {
        System.out.println("Write coordinates of 1st Line");
        double a= CheckLine();
        System.out.println("Write coordinates of 2nd Line");
        double b=CheckLine();
        if (a < b){
            System.out.println("First Line is greater");
        }
        else if(a > b){
            System.out.println("Second Line is greater");
        }
        else{
            System.out.print("Both lines are equal");
        }
    }
}
