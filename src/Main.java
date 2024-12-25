import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fonctions fonctions = new Fonctions();
        Scanner scanner = new Scanner(System.in);

        String choice;

        do {
            System.out.println("================== M E N U ==================");
            System.out.println("1: Add a Person");
            System.out.println("2: Display Persons");
            System.out.println("3: Search a Person");
            System.out.println("4: Update a Person");
            System.out.println("5: Remove a Person");

            System.out.println("0: Exit");
            System.out.println("_____________________________________________________");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    Fonctions.addPerson();
                    break;
                case "2":
                    Fonctions.displayPersons();
                    break;

                case "3":
                    Fonctions.searchPersons();
                    break;

                case "4":
                    Fonctions.updatePerson();
                    break;

                case "5":
                    Fonctions.remvePerson();
                    break;

                case "0":
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("0"));
    }
}