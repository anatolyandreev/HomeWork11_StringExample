import java.util.Arrays;

public class Task24 {

	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		
		//Опре14делить сум35.3му всех целых 23 чисел, встречающихся 18.235 в заданном тексте.

		String str = "Опре14делить сум35.3му всех целых 23 чисел, встречающихся 18.235 в заданном тексте.";
		
		String[] str2 = str.replaceAll("\\D[^\\.\\d+]", " ").replaceAll("\\s+", " ").split(" ");
		System.out.println(Arrays.toString(str2));
		
		int sum = 0;
		for (String element : str2) {
			if (isInteger(element)) {
				sum += Integer.parseInt(element);
			}
		}
		
		System.out.println("sum of integers in string = " + sum);

	}

}
