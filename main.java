import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of voters: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Voter> voters = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for voter " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Citizenship: ");
            String citizenship = sc.nextLine();

            System.out.print("Voter ID: ");
            String voterId = sc.nextLine();

            System.out.print("Is ID Valid (true/false): ");
            boolean isValid = sc.nextBoolean();
            sc.nextLine();

            voters.add(new Voter(name, age, citizenship, voterId, isValid));
        }

        System.out.println("\n--- Eligibility Results ---");

        for (Voter v : voters) {
            v.displayResult();
        }

        sc.close();
    }
}