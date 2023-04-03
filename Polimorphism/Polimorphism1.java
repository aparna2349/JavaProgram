class AeroPlane2 //parent class
{
    public void takeoff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane2 extends AeroPlane2  //child class
{
   public void takeOff()
   {
    System.out.println("Cargoplane requires longer runway");
   }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }
}
class PassengerPlane2 extends AeroPlane2 //child class
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
class FighterPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
        System.out.println("Fighter flies at high height");
    }
}

class Airport
{
    public void poly(AeroPlane2 ref)
    {
        ref.takeOff();
        ref.fly();

        System.out.println("-------------------------------------------------");
    }
}
class Polimorphism1
{
    public static void main(String[] args)
    {
       CargoPlane2 cp = new CargoPlane2();
       
       PassengerPlane2 pp = new PassengerPlane2();

       FighterPlane2 fp = new FighterPlane2();

       Airport a = new Airport();
       a.poly(cp);
       a.poly(pp);
       a.poly(fp);


       //cp.takeOff();
       //cp.fly();

       //pp.takeOff();
       //pp.fly();

       //fp.takeOff();
       //fp.fly();

    }
}

