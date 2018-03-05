import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {

	public static void main(String[] args) {

		// Определить, сколько раз повторяется в тексте каждое слово, которое
		// встречается в нем.
		
		// алгоритм:
		// 1. создаем массив слов (разделителем является пробел)
		// 2. удаляем из массива слов дубликаты, остаются только уникальные слова
		// 3. считаем сколько раз каждое уникальное слово появляется в массиве созданном в 1.

		

		String str = "Определить, сколько раз повторяется Определить в тексте каждое определить слово, которое встречается в нем.";
		String[] initialArrayWithDuplicates = str.toLowerCase().replaceAll("[\\p{Punct}]", "").split("\\s+");
		String[] arrayWithDuplicates = str.toLowerCase().replaceAll("[\\p{Punct}]", "").split("\\s+");

		int noOfUniqueElements = arrayWithDuplicates.length;
		int size = arrayWithDuplicates.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arrayWithDuplicates[i].equals(arrayWithDuplicates[j])) {
					arrayWithDuplicates[j] = arrayWithDuplicates[size - 1];
					size--;
					j--;
					noOfUniqueElements--;
				} 
			} 
		}
		
		String[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		
		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			int counter = 0;
			for (int j = 0; j < initialArrayWithDuplicates.length; j++) {
				if (arrayWithoutDuplicates[i].equals(initialArrayWithDuplicates[j])) {
					counter++;
				}
			}
			System.out.println("word " + "'" + arrayWithoutDuplicates[i] + "'" + " appears " + counter + " times");
		}

	}

}
