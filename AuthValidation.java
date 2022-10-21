import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AuthValidation {
    public String[]  authenticate( String username, String password) throws IOException {
        File buyer = new File("SER515-Fall2022/BuyerInfo.txt");
        File seller = new File("SER515-Fall2022/SellerInfo.txt");
        Scanner bc = new Scanner(buyer);
        Scanner sc = new Scanner(seller);
        String[] authResult = new String[2];
        authResult[0]="false";
        authResult[1]="ff";
        while(bc.hasNextLine()){
            String bd=bc.nextLine();
            String arr[]=bd.split(":");
            if(arr[0].equals(username) && arr[1].equals(password)){
                authResult[0] = "true";
                authResult[1] = "isBuyer";
                return authResult;
            }
        }
        while(sc.hasNextLine()){
            String sd=sc.nextLine();
            String arr[]=sd.split(":");
            if(arr[0].equals(username) && arr[1].equals(password)){
                authResult[0] = "true";
                authResult[1] = "isSeller";
                return authResult;
            }
        }
        return authResult;
    }
}
