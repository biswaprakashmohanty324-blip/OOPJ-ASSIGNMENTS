class person{
     String firstname;
    String lastname;
  String getFirstName(){
              return firstname;
}
String getLastName(){
          return lastname;
}
  }
class employee extends person{
        String jobtitle;
        String empid;
   String getemployeeid(){
        return empid;
}
String getLastName(){
      return  lastname+"("+jobtitle+")";
}
   String getemployeeinfo(){
         return firstname+" "+ getLastName() +" "+getemployeeid();
}
public static void main(String args[]){
       employee e = new employee();
          e.empid ="Emp101";
          e.firstname="Rahul";
          e.lastname="kumar";
     e.jobtitle="Software Architecture";
System.out.println(e.getemployeeinfo());
}
}