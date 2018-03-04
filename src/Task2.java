import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.stream.events.Characters;

public class Task2 {

	static void removeWhitespaces(StringBuilder sb) {
		int k = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (!Character.isWhitespace(sb.charAt(i))) {
				sb.setCharAt(k++, sb.charAt(i));
			}
		}
		sb.delete(k, sb.length());
	}

	public static void main(String[] args) {

	
		String s1 = "А, тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в одной строке печатать текст с двумя пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее номер.";
		StringBuilder str = new StringBuilder(s1.replaceAll("[^а-яА-Я]", ""));
		
		char[] m = new char[64];
		for (int i = 0; i < 64; i++) {
			m[i] = (char) ('А' + i);
		}
		
		removeWhitespaces(str);
		int[] array = new int[str.length()];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (m[i] == str.charAt(j)) {
					if (i > 32 && i <= 64) {
						array[j] = i-32;
					} else {
						array[j] = i;
					}
				}
			}
		}

		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%-4s", str.charAt(i));
		}
		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%-4d", array[i]);

		}
	}
}
