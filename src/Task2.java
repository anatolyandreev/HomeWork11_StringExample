import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.stream.events.Characters;

public class Task2 {

	static void removeWhitespaces(StringBuilder sb) {
		int k = 0;
		  for(int i = 0; i < sb.length(); i++) {
		    if (!Character.isWhitespace(sb.charAt(i))) {
		       sb.setCharAt(k++, sb.charAt(i));
		    }
		  }
		  sb.delete(k, sb.length());
	}
	
	public static void main(String[] args) {

		StringBuilder str = new StringBuilder(
				"В тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в одной строке печатать текст с двумя пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее номер.");
		String s1 = "В тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в одной строке печатать текст с двумя пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее номер.";
		StringBuilder str1 = new StringBuilder(str);
		char[] m = new char[64];
		for (int i = 0; i < 64; i++) {
			m[i] = (char) ('А' + i);
		}
		//System.out.println(Arrays.toString(m));
		
		removeWhitespaces(str);
		//System.out.println(str);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (m[i] == str.charAt(j)) {
					str.deleteCharAt(j);
					if (i > 32 && i <= 64) {
						str.insert(j, String.valueOf(i - 32) + "  ");
					} else {
						str.insert(j, String.valueOf(i) + "  ");
					}
				}
			}
		}

//		System.out.println(str1);
	
		removeWhitespaces(str1);
		
		for (int i = 0; i < str1.length(); i++) {
				System.out.print(str1.charAt(i) + "  ");
			}
		
		System.out.println("\n");
		System.out.println(str);
	}

}
