import java.util.*;
//Creating an Interface
interface Mmarks{
//Abstract Setters
public void setCat1();
public void setCat2();
public void setAsign();
public void setExam();
//Abstract Gtters
public int getCat1() ;
public int getCat2() ;
public int getAsign() ;
public int getExam() ;
public String grading(double m) ;
}//End of Interface mmarks
//Class Subjcec Makes use of the Interface
class Subject implements Marks{
String code;
String sname;
int cat1, cat2, asign, exam;
public void setCode(String c){ code=c;}
public void setName(String n){ sname=n;}
public String getCode(){return code;}
public String getName(){ return sname;}
//Implementing the abstract set methods in interface Marks
public void setCat1(){
cat1=(int)Math.ceil(Math.random()*15);
}//End of setCat1
public void setCat2(){
cat2=(int)Math.ceil(Math.random()*10);
}//End of setCat2
public void setAsign(){
asign=(int)Math.ceil(Math.random()*15);
}//End of setAsign
public void setExam(){
exam=(int)Math.ceil(Math.random()*60);
}//End of setExam
//Implementing the abstract get methods in interface Marks
public int getCat1(){ return cat1;}//End of getcat1
public int getCat2(){return cat2;}//End of getcat2
public int getAsign(){ return asign;}//End of getcat1
public int getExam(){ return exam;}//End of getexam
public String grading(double m){
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
}//End of Class Subject//Class Student Inherits everything in Class Subject
class Student extends Subject{
int stnum;
String stname;
Subject[] sbj=new Subject[7];// Take not in a semester a student may undertake 7 units
public void setNumber(int n){ stnum=n;}
public void setStName(String nm){stname=nm;}
public int getNumber(){ return stnum;}
public String getStName(){ return stname;}
}//End of Class Student
/Implementing the abstract set methods in interface Marks
//Class InterfaceExample is the main class to make use of the Classes above
public class InterfaceExample{
static Scanner scan=new Scanner(System.in);
//Array of 7 subject names
static String subjects[]={"OOP1","Operating System","Networking","OOP2","INternet
Technology","Java Servelets","Database Administration"};
//Array of 7 subject codes
static String
codes[]={"CMT001","CMT002","CMT007","CMT003","CMT004","CMT005","CMT0
06"};
//The main function
public static void main(String [] args){
//Variable to be use in processing the marks
st.sbj[i].setCat1();
st.sbj[i].setCat2();
st.sbj[i].setAsign();
st.sbj[i].setExam();
}
//Obtain the largest length of unit name to use it for formatted output
int len="Database Administration".length();
//Processing the makrks
System.out.println("CODE
\tName
\tCat1\tCat2\tASIGN\tTCATS\tEXAM\tAGG\tGRADE");
for (int j=0;j<7;j++){
c1=st.sbj[j].getCat1();
c2=st.sbj[j].getCat2();
asign=st.sbj[j].getAsign();
exm=st.sbj[j].getExam();
tcats=c1+c2+asign;
total=tcats+exm;
//Getting theformatted Unit name
//WE are padding spaces to the right of every unit name so that they are of the same
length
String sbname=String.format("%"+-(len)+"s",st.sbj[j].getName()).replace(' ',' ');
System.out.println(st.sbj[j].getCode()
+"\t"+sbname+"\t"+c1+"\t"+c2+"\t"+asign+"\t"+tcats+"\t"+exm+"\t"+total+"\t"+st.sbj[j]
.grading(total));
}
}//End of main
}//End of Class AbstractExample1
/Implementing the abstract set methods in interface Marks
