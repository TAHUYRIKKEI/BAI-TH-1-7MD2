import java.util.Scanner;

public class Bai3sudungtoantuMD2 {
    public static void main( String[] args){
   float width;
   float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width:");
        width = scanner.nextFloat();
        System.out.println("Enter height:");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is:" + area);
    }
}

