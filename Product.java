import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Product {
    public void addNewProd( String prodType, String prodName) throws IOException{
        File prodInfo = new File("SER515-Fall2022/ProductInfo.txt");
        FileWriter filWri = new FileWriter(prodInfo.getName(), true);
        BufferedWriter bufWri = new BufferedWriter(filWri);

    }

    public void showMenu() throws IOException{
        System.out.println("BRIDGE Initiated");
        File prodInformation = new File("SER515-Fall2022/ProductInfo.txt");
        Scanner scan = new Scanner(prodInformation);
        while (scan.hasNextLine()){
            String temp= scan.nextLine();
            String products[]=temp.split(":");
            String productName= products[1];
            System.out.println(products[1]);
        }
        System.out.println("FACTORY Initiated");
    }
}
