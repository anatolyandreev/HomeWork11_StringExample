import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {

	public static void main(String[] args) {

		// Преобразовать текст так, чтоБы Только В первые буквы каждого
		// предложения были заглавными. и так далее. а ПОТОМ. еще что-нибудь
		// придумаем

		String str = "Преобразовать текст так, чтоБы Только В первые буквы каждого предложения были заглавными. и так далее. а ПОТОМ. еще что-нибудь придумаем";
		StringBuilder strBuilder = new StringBuilder(str.toLowerCase());

		// \\b - word boundary followed by \\. - dot followed by \\s -
		// whitespace
		Pattern p = Pattern.compile("\\.\\s\\b");
		Matcher m = p.matcher(strBuilder);

		strBuilder.setCharAt(0, Character.toUpperCase(strBuilder.charAt(0)));
		while (m.find()) {
			strBuilder.setCharAt(m.end(), Character.toUpperCase(strBuilder.charAt(m.end())));
		}
		System.out.println(strBuilder);
	}

}
