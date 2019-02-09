package hw2nayeemchoudhury;

public class UseString {
	public static void main(String[] args) {
		String myPhrase = "My name is Nayeem Choudhury.";
		
		System.out.println(myPhrase.toLowerCase());
		System.out.println(myPhrase.length());
		System.out.println(myPhrase.hashCode());
		System.out.println(myPhrase.compareTo(myPhrase));
		System.out.println(myPhrase.offsetByCodePoints(0, 0));
		System.out.println(myPhrase.codePoints());
		System.out.println(myPhrase.offsetByCodePoints(0, 10));
		System.out.println(myPhrase.startsWith("My"));
		System.out.println(myPhrase.subSequence(0,17));
		System.out.println(myPhrase.substring(0,21));
		System.out.println(myPhrase.concat(myPhrase));
		System.out.println(myPhrase.intern());
		System.out.println(myPhrase.replaceFirst("name", "identity"));
		System.out.println(myPhrase.equalsIgnoreCase(null));
		System.out.println(myPhrase.lastIndexOf(0, 20));
		System.out.println(myPhrase.contentEquals("nothing"));
		System.out.println(myPhrase.replaceFirst(myPhrase, "Nayeem"));
		System.out.println(myPhrase.substring(0));
		System.out.println(myPhrase.split(null, 0));
		System.out.println(myPhrase.format(null, args));
		System.out.println(myPhrase.copyValueOf(null));
		System.out.println(myPhrase.trim());
		System.out.println(myPhrase.chars());
		System.out.println(myPhrase.valueOf(0));
		System.out.println(myPhrase.regionMatches(true, 0, null, 0, 0));
		System.out.println(myPhrase.hashCode());
		System.out.println(myPhrase.subSequence(0, 6));
		System.out.println(myPhrase.concat(myPhrase));
		System.out.println(myPhrase.lastIndexOf(0, 10));
		
	}

}
