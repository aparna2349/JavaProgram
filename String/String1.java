public class String1 {

    public static void main(String[] args)
    {
        String brand = "pwskills";
        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("pwskills");
        System.out.println(brand1);
        brand1.append("Bengaluru");
        System.out.println(brand1);
    }
    
}
