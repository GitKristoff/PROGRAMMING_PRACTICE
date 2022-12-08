package JavaProgramming;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        try {
            File file = new File("personal_data.csv");
            FileWriter fw = new FileWriter(file, true);
            StringBuilder sb = new StringBuilder();

            System.out.println("<====== PERSONAL INFORMATION =====>");

            System.out.print("Last Name: ");
            String lastname = scanner.nextLine();

            System.out.print("First Name: ");
            String firstname = scanner.nextLine();

            System.out.print("Middle Name: ");
            String middlename = scanner.nextLine();

            sb.append("Last Name");
            sb.append(",");
            sb.append("First Name");
            sb.append(",");
            sb.append("Middle Name");

            sb.append("\n");

            sb.append(lastname);
            sb.append(",");
            sb.append(firstname);
            sb.append(",");
            sb.append(middlename);
            
            fw.write(sb.toString());

            fw.close();
            System.out.println("Finished");

        } catch (Exception e) {
            
        }
        scanner.close();
    }
    
}