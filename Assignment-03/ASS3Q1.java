import java.util.*;
class ASS3Q1 {
    public static void main( String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter 5 subject marks :");
          int  Sub1 = sc.nextInt();
          int  Sub2 = sc.nextInt();
          int  Sub3 = sc.nextInt();
          int Sub4 = sc.nextInt();
          int  Sub5 = sc.nextInt();
          double Total = Sub1 + Sub2 +Sub3 + Sub4 + Sub5;
          double Percentage =  (Total / 500 ) * 100;
          System.out.println("Total  : " + Total);
          System.out.println(" Percentage  : " + Percentage);
          sc.close();
    }


}