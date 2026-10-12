import java.lang.*;
class ASS2Q5{
        public static void main(String args[]){
              int minutes=20000;
              int totaldays=minutes/1440;
              int years=totaldays/365;
              int days=totaldays%365;
              System.out.println("years:"+years);
              System.out.println("days:"+days);
      }
}