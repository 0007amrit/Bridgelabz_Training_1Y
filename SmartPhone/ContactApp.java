package SmartPhone;

public class ContactApp {
    public static void main(String[] args) {
        Contact normal = new Contact("Amrit", "98765-43210");
        BusinessContact business = new BusinessContact("Srestu", "91234-56789", "TechCorp");

        System.out.println("--- Mobile Contact List ---");
        normal.display();
        business.display();
    }
}