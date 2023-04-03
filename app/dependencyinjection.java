class Car //target class
{
    private Engine eng;

    public Car(Engine eng)
    {
       this.eng = eng;
    }
    public void start()
    {
    eng.engineStart();
    }
}
class Engine  //dependent class
{
    public void engineStart()
    {
        System.out.println("Car started");
    }

}

public class dependencyinjection
{
    public static void main(String[] args)
    {
        Engine e =  new Engine();
        Car c = new Car(e);
        c.start();

    }
}
