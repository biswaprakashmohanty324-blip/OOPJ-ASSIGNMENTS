import java.util.*;
class ASS3Q2{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.print("Enter basic salary :");
double basic=sc.nextDouble();
double hra=basic*0.1;
double da=basic*0.6;
double gs=basic+da+hra;
System.out.println("HRA"+hra);
System.out.println("DA"+da);
System.out.println("gross salary :"+gs);
  }
 }

