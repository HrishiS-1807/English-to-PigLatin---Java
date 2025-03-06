
This project provides a simple implementation of a Pig Latin translator in Java. The program takes an input phrase in English and converts it to Pig Latin, following the typical rules of Pig Latin translation.
Features

    Pig Latin Conversion: Converts English phrases to Pig Latin.
    Handles Vowels and Consonants: Words that start with vowels are modified with "yay", while words starting with consonants move the consonants to the end and add "ay".
    Handles "Y" as a Special Case: Words starting with the letter "Y" are treated as starting with a vowel and are translated with "yay".

Technologies Used

    Java: The program is written in Java and can be run on any Java-enabled environment.

How to Use

    Clone or download the repository.
    Open the PigLatin.java and PigLatinTester.java files in a complier of your choice.
    Run the PigLatinTester.java file to test various phrases converted to Pig Latin!

How to Add/Alter Phrases!
1. Locate the string phrases given:
      String phrase1 = "The black cat ate the apple";
      String phrase2 = "Writing college essays is driving me crazy";
      String phrase3 = "Everyone loves to code in Java";

2. Alter the phrases as needed to change up the output!
3. Add "String phrase4= "*your phrase*" to add a fourth phrase.

Sample Output:

    In English:
        The black cat ate the apple
    In Pig Latin:
        Ethay ackblay atcay ateyay ethay appleyay
    
    In English:
        Writing college essays is driving me crazy
    In Pig Latin:
        Itingwray ollegecay essayay isyay ivingdray emay azycray
    
    In English:
        Everyone loves to code in Java
    In Pig Latin:
        Everyoneyay oveslay otay odecay inyay avajay
