public class App {
    public static void main(String[] args) throws Exception {
        
        Driver driver1 = new Driver("Violet", 3);
        AmazonVan van1 = new AmazonVan("COMPSCI", 100.00, 5, driver1, false, "Big Bertha");
        
        AmazonVan van2 = new AmazonVan(67.00, 5, true);

        System.out.println();
        System.out.println("Before behaviors: ");
        System.out.println();
        System.out.println(van1);
        System.out.println();
        System.out.println(van2);
        System.out.println();

        van1.deliver();
        van2.deliver();

        van1.breakDuration(2);
        van2.breakDuration(3);

        System.out.println("After behaviors: ");
        System.out.println();
        System.out.println(van1);
        System.out.println();
        System.out.println(van2);

    }
}
