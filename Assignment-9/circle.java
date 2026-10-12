class shape{
    static double pi=3.14;
       double radius;
    void getperimeter(){}
      void getArea(){}
}
class circle extends shape{
       void getperimeter(){
        System.out.println(2*pi*radius);
}
void getArea(){
     System.out.println(pi*radius*radius);
}
public static void main(String args[]){
           circle c = new circle();
            c.radius=2.5;
           c.getperimeter();
         c.getArea();
}
}