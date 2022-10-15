import java.util.Scanner;

import static java.lang.System.out;
public class triangle{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        out.println("area  and perimeter of triangle");
        out.println("enter base :");
        int base =s.nextInt(); // input integer value
        out.println("enter height:");
        int height=s.nextInt();
        int area =(base*height)/2;
        out.println("enter value of three side of triangle ");
        out.println("enter sides :");
        int s1 =s.nextInt();
        int s2 =s.nextInt();
        int s3 =s.nextInt();
        int perimeter=s1=s2+s3;
        out.println("area of the triangle ="+area);
        out.println("perimeter of triangle ="+perimeter);
    }
}

