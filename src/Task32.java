import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {

		// Подсчитать, сколько раз заданное слово входит в текст. И какое еще слово можно тут встретить.
		
		String str = "Подсчитать, сколько раз заданное слово входит в текст. И какое еще слово можно тут встретить.";
		String[] wordArr = str.toLowerCase().replaceAll("\\p{Punct}", "").split("\\s+");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.next();
		
		int counter = 0;
		for (String wordElement : wordArr) {
			if (wordElement.equals(word)) {
				counter++;
			}
		}
		
		System.out.println("the word '" + word + "' repeats " + counter + " times");
	}

}
