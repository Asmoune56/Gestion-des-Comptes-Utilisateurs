import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Fonctions {
    static ArrayList<User> users ;
    static Scanner scanner ;



    public Fonctions() {
        users=new ArrayList<>();
        scanner=new Scanner(System.in);
    }
    static void addPerson()
    {
        System.out.print("cin : ");
        String cin=scanner.nextLine();
        System.out.print("name : ");
        String name=scanner.nextLine();
        System.out.print("age : ");
        int age=scanner.nextInt();
        System.out.print("Role : ");
        Role role = new Role(scanner.next());
        //sc.nextLine();
        System.out.print("email : ");
        String email=scanner.next();
        scanner.nextLine();
        System.out.println("password");
        String password=scanner.nextLine();
        users.add(new User(name,age,cin,role,email,password));

    }
    static void displayPersons()
    {
        if (users.isEmpty()){
            System.out.println(" list vide ");
        }
        for (User user:users)
        {
            System.out.println("=========== Persons ===========:");


            System.out.println(user);
        }
    }

    static void searchPersons()
    {
        System.out.println("CIN for search : ");
        String cin= scanner.nextLine();
        boolean found = false;
        for (User user : users)
        {
          if (user.getCin().equals(cin))
          {
              found = true;
              System.out.println(user);

          }

        }
        if (!found)
        {
            System.out.println(cin + " Not found ");
        }

    }
    static void updatePerson()
    {
        System.out.println("Enter CIN ");
        String cin=scanner.nextLine();

        for (User user : users)
        {
            if (user.getCin().equals(cin))
            {
                System.out.println(" <<<< M E N U >>>> ");
                System.out.println("1 : name");
                System.out.println("2 : age");
                System.out.println("3 : role");
                System.out.println("4 : email");
                String choice;
                choice= scanner.nextLine();
                switch (choice)
                {
                    case "1":
                        System.out.print("Enter new name : ");
                        String newName=scanner.nextLine();
                        user.setName(newName);
                        break;
                    case "2":
                        System.out.print("Enter new age : ");
                        int newAge=scanner.nextInt();
                        user.setAge(newAge);
                        break;
                    case "3":
                        System.out.print("Enter new Role : ");
                        String role=scanner.nextLine();
                        Role newRole = new Role(role);
                        user.setRole(newRole);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
    static void remvePerson()
    {
        if (users.isEmpty()){
            System.out.println("choice invalid");
        }
        System.out.print("Enter Cin remove : ");
        String cin = scanner.next();
        scanner.nextLine();

        users.removeIf(user -> user.getCin().equals(cin));
    }
}
