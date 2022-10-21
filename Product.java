import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
    public void addNewProd( String prodType, String prodName) throws IOException{
        File prodInfo = new File("SER515-Fall2022/ProductInfo.txt");
        FileWriter filWri = new FileWriter(prodInfo.getName(), true);
        BufferedWriter bufWri = new BufferedWriter(filWri);

    }
}
