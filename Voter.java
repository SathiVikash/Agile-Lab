public class Voter {
    String name;
    int age;
    String citizenship;
    String voterId;
    boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public String checkEligibility() {
        if (age < 18) {
            return "Not Eligible: Underage";
        }
        if (!citizenship.equalsIgnoreCase("Indian")) {
            return "Not Eligible: Not an Indian citizen";
        }
        if (!isIdValid) {
            return "Not Eligible: Invalid Voter ID";
        }
        return "Eligible to Vote";
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Status: " + checkEligibility());
        System.out.println("---------------------------");
    }
}