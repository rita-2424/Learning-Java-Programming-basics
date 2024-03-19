public class Label{
public static void main(String[]args){
//Creating labels for the heading
String lbel1="Name";
String lbel2="NUMBER";
String lbel3="CAT1";
String lbel4="CAT2";
String lbel5="EXAM";
//Creating and initializing an array of names so that we can use them
String names[]={"Joe Okoth","James Ruth","Joel Maina","Ladiah Joe","Joice Steph","Judy Njoroge","James Kiptoo","Steph Woren","Maria James","Philis Wakah"};
System.out.println(String.format("%12s %9s %9s %9s %9s", lbel1,lbel2,lbel3,lbel4,lbel5));
for(int k=0;k<10;k++){
String strname= names[k];
int num=1000000+((int)Math.ceil(Math.random()*1000);
int cat1=5+((int)Math.ceil(Math.random()*15);
int cat2=((int)Math.ceil(Math.random()*10);
int exam=((int)Math.ceil(Math.random()*70);
System.out.println(String.format("%12s %7s %9d %9d %9d", strname,num,cat1,cat2,exam));
}
}
}
