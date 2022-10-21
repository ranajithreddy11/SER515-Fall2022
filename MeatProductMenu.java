import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() throws IOException{
		File prodInformation = new File("SER515-Fall2022/ProductInfo.txt");
		Scanner scan = new Scanner(prodInformation);
		System.out.println("Meat Product Menu:");
		while (scan.hasNextLine()){
			String temp= scan.nextLine();
			String products[]=temp.split(":");
			String productType= products[0];
			String productName= products[1];
			if(productType.equals("Meat"))
				System.out.println(products[1]);
		}
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
