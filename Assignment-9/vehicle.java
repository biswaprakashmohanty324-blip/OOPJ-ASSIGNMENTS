class vehicle {
 String make;
 String model;
   double fuel;
   vehicle(String make , String model ,double fuel){
     this.make = make;
     this.model = model;
     this.fuel = fuel;
    }
    void fuelefficiency(){
         System.out.println("fuel efficiency calculation ");
    }void distancetravelled(){
         System.out.println("distance travelled ");
     }
     void maxspeed(){
         System.out.println("maximum speed");
     }
   }
     class truck extends vehicle {
         truck (String make,String model,double fuel){
          super(make,model,fuel);
    }
     void fuelefficiency(){
         System.out.println("truck fuel efficiency:8km/h  ");
    }void distancetravelled(){
         System.out.println("truck distance: 400km ");
     }
     void maxspeed(){
         System.out.println("car maximum speed:100km/h");
     }
  }
     class car extends vehicle {
         car (String make,String model,double fuel){
          super(make,model,fuel);
    }
     void fuelefficiency(){
         System.out.println("car fuel efficiency:18km/h  ");
    }void distancetravelled(){
         System.out.println("car distance : 500km ");
     }
     void maxspeed(){
         System.out.println("car maximum speed:180km/h");
     }
  }
     class motorcycle extends vehicle {
         motorcycle (String make,String model,double fuel){
          super(make,model,fuel);
    }
     void fuelefficiency(){
         System.out.println("motorcycle fuel efficiency:45km/h  ");
    }void distancetravelled(){
         System.out.println("motorcycle distance: 300km ");
     }
     void maxspeed(){
         System.out.println("motorcycle maximum speed:120km/h");
     }
  }
     class main{
       public static void main(String args[]){
             car c =new car("Maruti","Swift",30);
             System.out.println(c.make);
             System.out.println(c.model);
             c.fuelefficiency();
             c.distancetravelled();
             c.maxspeed();
         }
      }
