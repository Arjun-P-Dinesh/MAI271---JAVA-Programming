import java.util.Scanner;

public class ShareTrade {

	public static void main(String[] args)   {  
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the stock prices: ");
        String[] input = scanner.nextLine().split(" ");

        int n = input.length;
        int price[] = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(input[i]);
        }
        System.out.println(maxProfit(price, n));
	}






}
