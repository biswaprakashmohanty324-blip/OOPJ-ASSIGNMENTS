import java.util.*;
class ASS3Q5{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
double buy,sell,diff, lp, pp;
System.out.print("Enter buy price  :");
  buy=sc.nextDouble();
System.out.print("Enter sell price  :");
  sell=sc.nextDouble();
  sc.close();
if(buy==sell){
 System.out.print("no profit/loss");
}
else if(buy>sell){
   diff=buy-sell;
   lp=diff*100/buy;
 System.out.print("loss percentage is :"+ lp +"%");
}
else {
    diff=sell-buy;
   pp=diff*100/buy;
 System.out.print("profit percentage is :"+pp+"%");
  
  }
}
