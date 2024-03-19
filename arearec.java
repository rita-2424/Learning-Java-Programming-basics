
import java.util.Scanner;
class arearec{
public static void main(String args[]){

Scanner input=new Scanner(System.in);

System.out.println("Enter Length of the rectangle");
int length=input.nextInt();

System.out.println("Enter the width of the rectangle");
int width=input.nextInt();

int area=length*width; //(1/2)*lenth*width;
System.out.println("The area of your rectangle is:"+area);
}
}
