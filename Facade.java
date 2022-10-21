import java.io.IOException;
import java.util.Scanner;

public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public void initializeFacade() throws IOException {
		System.out.println("Please login to continue!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username:");
		String username = sc.next();
		System.out.println("Enter the Password:");
		String password = sc.next();
		String[] authResult = login(username,password);
		String user;
		if (authResult[1] == "isBuyer") {
			user = "Buyer";
		}
		else {
			user = "Seller";
		}
		if(authResult[0].equals("true")){
			System.out.println("You are successfully logged in as "+ user+"!");
			System.out.println("Please select your menu preference");
			System.out.println("Enter 0 for meat products, 1 for Produce products:");
			String productType = sc.next();
			if (productType.equals("0")){
				MeatProductMenu meatProd = new MeatProductMenu();
				meatProd.showMenu();
			}
			else if(productType.equals("1")){
				ProduceProductMenu prodProd = new ProduceProductMenu();
				prodProd.showMenu();
			}
			else{
				System.out.println("Option unavailable, please enter the correct option!");
			}

		}
		else
			System.out.println("Login failed, Please enter the correct credentials!");
	}
	public String[] login(String username, String password) throws IOException {
		AuthValidation obj = new AuthValidation();
		String[] authResult = obj.authenticate(username,password);
			return authResult;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}

}
