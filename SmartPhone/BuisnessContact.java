package SmartPhone;
class BusinessContact extends Contact {
    private String companyName;

    public BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber); // Pass data to the parent constructor
        this.companyName = companyName;
    }

    @Override
    public void display() {
        // Task: Display name in uppercase using toUpperCase()
        String upperName = name.toUpperCase();

        // Using String formatting to include the company name
        System.out.printf("NAME: %-15s | Phone: %-12s | Company: %s%n",
                upperName, phoneNumber, companyName);
    }
}