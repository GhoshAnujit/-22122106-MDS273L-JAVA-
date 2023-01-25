import java.util.Scanner;
public class LAB1StudentDetails {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Class: ");
        String Class = sc.nextLine();

        System.out.print("Enter Gender (m/f): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter your state: ");
        String state = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (gender == 'm') {
            System.out.println("Gender: MALE");
        } else if (gender == 'f') {
            System.out.println("Gender: FEMALE");
        }

        switch (state) {
            case "Andhra Pradesh", "Karnataka", "Kerala", "Tamil Nadu", "Telangana":
                System.out.println("The student is from the southern states of India.");
                break;
            case "Jammu & Kashmir", "Himachal Pradesh", "Punjab", "Uttarakhand", "Haryana", "Delhi", "Rajasthan", "Uttar Pradesh", "UT Chandigarh":
                System.out.println("The student is from the Northern states of India.");
                break;
            case "Arunachal Pradesh", "Assam", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Sikkim", "Tripura":
                System.out.println("The student is from the Eastern states of India.");
                break;
            default:
                System.out.println("The student is from  Western regions of India.");
        }
        }
        
    }
    

