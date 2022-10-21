import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Trading {

	public void accept(NodeVisitor visitor) {

	}

	public void bidValue( String item) throws IOException {
		File bidData = new File("SER515-Fall2022/UserProduct.txt");
		Scanner bidObj = new Scanner(bidData);
		int out = 0;
		while(bidObj.hasNextLine())
		{
			String bid[]= bidObj.nextLine().split(":");
			if (bid[1].equals(item))
			{
				System.out.println(bid[0]);
				out = out +1;
			}
		}
		System.out.println("There are "+out+" number of users associated with the selected dish");
	}

}
