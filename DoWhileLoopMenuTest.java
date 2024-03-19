import java.util.*;
class DoWhileLoopMenuTest{
static Scanner scan=new Scanner(System.in);
public static void main(String [] args){
int option;
do{
System.out.println("Enter [1] to Print Integer numbers ");
System.out.println("Enter [2] to Print Squares ");
System.out.println("Enter [3] to Print Cube roots ");
System.out.println("Enter [4] to Print all odd numbers between 3 and 57");
System.out.println("Enter [5] to Print all the multiples of 11 between 1 and 199");
System.out.println("Enter [6] to Exit The System ");
option=scan.nextInt();
switch(option){
case 1:
printInteger();
break;
case 2:
printSquares();
break;
case 3:
printCubes();
break;
case 4:
printOdd();
break;
case 5:
printMult();
break;
case 6:
System.out.println("You chose to Exit the system");
System.exit(0);
break;
default :System.out.println("Invalid Option");
break;
}
}while(true);//end of do-while loop
}//end of main function
//Methods Section
public static void printInteger(){
for(int i=0; i<10; i++){
System.out.print(i+"\t");
}
System.out.println();
}// End of printInteger
public static void printSquares(){
for(int i=0; i<10; i++){
System.out.print(Math.pow(i,2)+"\t");
}
System.out.println();
}// End of printSquares
public static void printCubes(){
for(int i=0; i<10; i++){
System.out.print(Math.pow(i,3)+"\t");
}
System.out.println();
}// End of printCubes

public static void printOdd(){
for(int i=4; i<57; i++){
if (i%2==1) {
System.out.print(i+"\t");
}
}
System.out.println();
}

public static void printMult(){
for(int i=2; i<199; i++){
if (i%11==0) {
System.out.print(i+"\t");
}
}
System.out.println();
}


}
