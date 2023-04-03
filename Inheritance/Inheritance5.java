class Aeroplane //parent class
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

class CargoPlane extends Aeroplane  //child class
{
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }
   public void carryGoods()
   {
    System.out.println("Cargoplane carries may be goods");
   }
}
class PassengerPlane extends Aeroplane //child class
{
    public void fly()
    {
     System.out.println("Passengerplane flies at medium height");
    }
    public void carryPassenger()
    {
     System.out.println("PassengersPlane carries passengers");
    }


}
class Inheritance5
{
    public static void main(String[] args)
    {
       CargoPlane cp = new CargoPlane();
       cp.takeoff();
       cp.fly();

       PassengerPlane pp = new PassengerPlane();
       pp.takeoff();
       pp.fly();


    }
}
