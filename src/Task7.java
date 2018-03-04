import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

	// Из текста удалить все символы, кроме пробелов, не являющиеся буквами.
	// Между последовательностями подряд идущих букв оставить хотя бы один пробел.
	public static void main(String[] args) {
		String str = new String(
				"Из текста удалить все **%* симво-лы, кроме пр%обелов, не я0вляющиеся буквам)и. + Между последовательностями подряд идущих букв оставить хотя бы один пробел.");

		//System.out.println(str.replaceAll("[^а-яА-Я]", ""));
		
		String[] strArray = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (String word : strArray) {
			String newWord = word.replaceAll("[^а-яА-Я]", "");
			sb = sb.append(newWord + " ");
		}
		System.out.println(sb);
	}
}