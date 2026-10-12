class Employee{
String name;
double salary;
int hiredate;
int yearOfService(int date){
  int currentYear=2026;
  hiredate=currentYear-date;
  return hiredate;
}
void display(){
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
System.out.println("Years Of Service:"+hiredate);
}
public static void main(String args[]){
Employee e=new Employee();
e.name="Babulu";
e.salary=50000;
e.yearOfService(2021);
e.display();
}
}