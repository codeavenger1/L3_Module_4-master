package threads;

public class reverseString {
public static void main(String[] args) {
	reverseString reverse = new reverseString();
	System.out.println(reverse.reverse("apple"));
	
}
	String reverse(String word) {
	if (word.equals("")) {
		return "";
	}
	else {
		return word.charAt(word.length()-1) + reverse(word.substring(0,word.length()-1));
	}	
}
}
