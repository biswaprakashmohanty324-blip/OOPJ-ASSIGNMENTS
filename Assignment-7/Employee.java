class Employee{
    String name;
    String job;
    double salary;

    double Calculatesalary(int workingDays){
      double dailysalary=salary/30;
      return dailysalary*workingDays;
}
void Updatesalary(int workingDays){
   salary=Calculatesalary(workingDays);
}
void display(){
System.out.println("Name ="+name);
System.out.println("Job ="+job);
System.out.println("Salary ="+salary);
}
public static void main(String args[]){
Employee e=new Employee();
e.name="Rahul";
e.job="Manager";
e.salary=30000;
double newsalary=e.Calculatesalary(25);
System.out.println("Calculated Salary ="+newsalary);
e.Updatesalary(25);
System.out.println("Updated Employee Details:");
e.display();
}
}