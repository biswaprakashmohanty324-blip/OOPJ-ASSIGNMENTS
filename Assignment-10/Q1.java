class Bank{
double roi;
void getroi(){
System.out.println("Display the Rate of Interest");
}
}
class Sbi extends Bank{
void getroi(){
	System.out.println("Rate Of Interest SBI:"+roi);
}
}
class Icici extends Bank{
void getroi(){
	System.out.println("Rate Of Interest ICICI:"+roi);
}
}
class Axis extends Bank{
void getroi(){
	System.out.println("Rate Of Interest of AXIS:"+roi);
}
}
class Q1{
public static void main(String args[]){
Sbi s=new Sbi();
s.roi=8.4;
s.getroi();
Icici i=new Icici();
i.roi=7.3;
i.getroi();
Axis a=new Axis();
a.roi=9.7;
a.getroi();
}
}

