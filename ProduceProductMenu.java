import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() throws FileNotFoundException {
		System.out.println("BRIDGE Initiated");
		File prodInformation = new File("SER515-Fall2022/ProductInfo.txt");
		Scanner scan = new Scanner(prodInformation);
		System.out.println("Produce Product Menu:");
		while (scan.hasNextLine()){
			String temp= scan.nextLine();
			String products[]=temp.split(":");
			String productType= products[0];
			String productName= products[1];
			if(productType.equals("Produce"))
				System.out.println(products[1]);
		}
		System.out.println("FACTORY Initiated");
	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
