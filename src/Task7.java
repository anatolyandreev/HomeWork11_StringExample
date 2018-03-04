import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

	// Из текста удалить все символы, кроме пробелов, не являющиеся буквами.
	// Между
	// последовательностями подряд идущих букв оставить хотя бы один пробел.
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(
				"Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между ");

		Pattern p1 = Pattern.compile("\\p{Punct}");
		Matcher m1 = p1.matcher(str);		
		
		for (int i = 0; i < str.length(); i++) {
			if (m1.find()) {
				System.out.println(i);
				System.out.println(m1.group());
			}
		}
		// System.out.println(m1.group());
	}
}