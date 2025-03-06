public class PigLatin {


    public static String toPigLatin(String phrase) {

        String[] words = phrase.split("\\s+");
        StringBuilder result = new StringBuilder();


        for (String word : words) {
            result.append(translateWordToPigLatin(word)).append(" ");
        }


        return result.toString().trim();
    }


    public static String translateWordToPigLatin(String word) {
        // Check if the word starts with a vowel
        if (startsWithVowel(word)) {
            return word + "yay"; 
        }

        else if (startsWithY(word)) {
            return word.substring(1) + "yay";  
        }

        else {
            return moveConsonantsToEnd(word) + "ay";  
        }
    }

    // Helper method to check if the word starts with a vowel
    private static boolean startsWithVowel(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }


    private static boolean startsWithY(String word) {
        return Character.toLowerCase(word.charAt(0)) == 'y';
    }


    private static String moveConsonantsToEnd(String word) {
        int index = 0;

        // Find the index of the first vowel
        while (index < word.length() && !startsWithVowel(word.substring(index))) {
            index++;
        }


        if (index > 0) {
            return word.substring(index) + word.substring(0, index);
        }


        return word;
    }
}
