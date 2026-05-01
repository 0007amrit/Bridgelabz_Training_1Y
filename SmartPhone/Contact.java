package SmartPhone;

class Contact {
    protected String name;
    protected String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        // Using String formatting for a clean output
        System.out.printf("Name: %-15s | Phone: %s%n", name, phoneNumber);
    }
}