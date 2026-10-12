import java.lang.*;
class ASS1Q5{
      public static void main(String args[]){
          double a=4,b=3,c=2;
          double s=(a+b+c)/2;
          double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println("area of the triangle:"+area);
    }
}