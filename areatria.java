import java.util.Scanner;
class areatria{
public static void main(String args[]){

Scanner self= new Scanner(System.in);

System.out.println("Enter the height of your triangle");
int height=self.nextInt();

System.out.println("Enter the base of your triangle");
int base=self.nextInt();

int area=(height*base)/2;
System.out.println("The area of your triangle is:"+area);
}
}
