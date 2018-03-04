import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		// В каждом слове текста k-ю букву заменить заданным символом. Если k
		// больше длины слова, корректировку не выполнять.
		
		// Disclaimer: в данной задаче под "словом" будем подразумевать
		// последовательность символов
		// окруженную как минимум одним пробелом

		String str = "В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.";
		char ch = '^';
		int k = 4;

		String[] strArray = str.split(" ");

		StringBuilder sb = new StringBuilder();
		for (String word : strArray) {
			if (k < word.length()) {
				String newWord = word.substring(0, k-1) + ch + word.substring(k);
				sb.append(newWord + " ");
			} else {
				sb.append(word + " ");
			}
		}
		System.out.println(sb);		
	}
}
