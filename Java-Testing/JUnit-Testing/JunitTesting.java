package testing;

import java.util.Scanner;

// Starting from scratch, like the Youtube video.
public class JunitTesting  {

	Scanner scan = new Scanner(System.in);
	public int square(int x) {

		return x*x; //squares a number by itself
	}

	public int countA(String word){
		int count = 0;
		for(int i = 0; i < word.length();i++){
			if (word.charAt(i)=='a' || word.charAt(i)=='A'){ //how many a's or A's appear
				count++;
			}
		}
		return count;
	}

	public double divide(int a, int b){
		return a / b; //returns double (decimal)
	}
}

