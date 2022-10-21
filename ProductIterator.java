import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductIterator {

	private ClassProductList classProductList;

	public boolean hasNext(String uname) throws FileNotFoundException {
		System.out.println("ITERATOR Initiated");
		File fileObj=new File("SER515-Fall2022/UserProduct.txt");
		Scanner scrobj=new Scanner(fileObj);
		while(scrobj.hasNextLine()){
			String stringval=scrobj.nextLine();
			String strArr[]=stringval.split(":");
			if(strArr[0].equals(uname))
				System.out.print(strArr[1]+" ");
		}
		System.out.println("\n");
		return false;
	}

	public Product Next() {
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
