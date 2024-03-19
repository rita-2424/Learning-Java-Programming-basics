import java.util.*;
abstract class Marks{
Scanner inpt=new Scanner(System.in);
int cat1, cat2, asign;
int exam;
//Abstarct Setters
abstract public void setCat1();
abstract public void setCat2();
abstract public void setAsign();
abstract public void setExam();
public int getCat1(){
return cat1;
}//End of getcat1
public int getCat2(){
return cat2;
}//End of getcat2
public int getAsign(){
return asign;
}//End of getcat1
public int getExam(){
return exam;
}//End of getexam
public static String grading(double m){
String gde;
if(m>=70)
gde="A";
else
if(m>=60)
gde="B";
else
if(m>=50)
gde="C";
else
if(m>=40)
gde="D";
else
gde="F";
return gde;
}
}//End of class marks
//Class subject extends Marks and therefore must implement all the abstract methods
class Subject extends Marks{
String code;
String sname;
public void setCode(String c){
code=c;
}
//Implementing the abstract methods
public void setCat1(){
System.out.println("Enter the maximum of CAT1");
int max=inpt.nextInt();
cat1=(int)Math.ceil(Math.random()*max);
}
public void setCat2(){
System.out.println("Enter the maximum of CAT2");
int max=inpt.nextInt();
cat2=(int)Math.ceil(Math.random()*max);
}
public void setAsign(){
System.out.println("Enter the maximum for Asignment");
int max=inpt.nextInt();
asign=(int)Math.ceil(Math.random()*max);
}
public void setExam(){System.out.println("Enter the maximum for Exam");
int max=inpt.nextInt();
exam=(int)Math.ceil(Math.random()*max);
}
//End of Implementing the abstract methods
public void setName(String n){
sname=n;
}
public String getCode(){
return code;
}
public String getName(){
return sname;
}
}//End of Class Subject
public class AbstractExample1{
//Declaring data that is required later in the program
static Scanner scan=new Scanner(System.in);
//The main function
public static void main(String [] args){
//Implementing the subjects
Subject sbj=new Subject();
System.out.println("Enter the code of the course");
sbj.setCode(scan.next());
System.out.println("Enter the Name of the course");
sbj.setName(scan.next());
//Setting Subject exam values
sbj.setCat1();
sbj.setCat2();
sbj.setAsign();
sbj.setExam();
int cat1=sbj.getCat1();
int cat2=sbj.getCat1();
int asign=sbj.getAsign();
int exam=sbj.getExam();
int tcats=cat1+cat2;
int total=tcats+exam;
System.out.println(sbj.getCode()+"\t"+sbj.getName()+"\t"+cat1+"\t"+cat2+"\t"+asign+"\t"+tcats+"\t"+exam+"\t"+total+"\t"+sbj.grading(total));
}//End of main
}//End of Class AbstractExample1
