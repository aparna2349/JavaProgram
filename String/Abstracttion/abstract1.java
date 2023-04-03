abstract  class AeroPlane3 //parent class
{

    //abstract int age;
   abstract public void takeoff();

    abstract public void fly();

    public void landing()
    {
        System.out.println("Aeroplane  is landing");
    }   
}

class CargoPlane3 extends AeroPlane3  //child class
{
   public void takeOff()
   {
    System.out.println("Cargoplane requires longer runway");
   }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }
   public void alert()
   {
    System.out.println("Alert..");
   }

}
class PassengerPlane3 extends AeroPlane3//child class
{
    public void takeOff()
    {
     System.out.println("Passengerplane requires medium size runway");
    }
    public void fly()
    {
     System.out.println("PassengersPlane flies at medium height");
    }
}

class abstract1
{
    public static void main(String[] args)
    {
       AeroPlane3 ref1 = new CargoPlane3();
       ref1.takeOff();
       ref1.fly();
       ref1.landing();
       ((CargoPlane3)ref1).alert();

       AeroPlane3 ref3 = new PassengerPlane3();
       ref3.takeOff();
       ref3.fly();
       ref3.landing();



    }
}

