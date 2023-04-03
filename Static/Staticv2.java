public class Staticv2 {
    static int age;//first
    

    static{ //second
        age = 18;
        System.out.println("Static block first");
        System.out.println(age);

    }
    static void display()
    {
        System.out.println("Static display method main ke baad jb hm call krenge");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method badme");
       // display();
    }
}

    

