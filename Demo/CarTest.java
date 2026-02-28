class Car { 
     private int speed; 
      public void setSpeed(int s)
       {
         if (s >= 0) 
         { speed = s;
          }
          else { 
            System.out.println("Speed cannot be negative!"); 
            } 
        } 
        public int getSpeed() 
        { return speed; 
        }
         }
          public class CarTest {
             public static void main(String[] args)
              { Car myCar = new Car();
                myCar.setSpeed(80); 
                System.out.println("Car speed: " + myCar.getSpeed());
                  myCar.setSpeed(-50);
                   System.out.println("Car speed after invalid input: " + myCar.getSpeed());
              }
         }