package main;

public class CapitalizedFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phrase = "hi im ejay";
		
		System.out.print(toJadenCase(phrase));
	}
	

	public static String toJadenCase(String phrase) {
		// TODO put your code below this comment
		
         if (phrase == null || phrase.isEmpty()) return null;

        // Split the string into words
        String[] words = phrase.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            // Capitalize the first letter of each word and add it back to the sentence
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            capitalizedSentence.append(capitalizedWord).append(" ");
        }

        // Trim the trailing space at the end of the sentence before returning
        return capitalizedSentence.toString().trim();
	}

}
