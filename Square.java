import java.util.Scanner;
public class Square{
	public static void main(String[] args){
	int counter = 1;

	Scanner input = new Scanner(System.in);
	Square m = new Square ();
	System.out.println("Number\tSquare");
	System.out.println("++++++\t++++++");
	while (counter < 7){
		++counter;
		System.out.println(counter + "\t" + (m.avg(counter)));
		}

	}


	int avg(int x){
		x = x * x;
		return x;
	}
}