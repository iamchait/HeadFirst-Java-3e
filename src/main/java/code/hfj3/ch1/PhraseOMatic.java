package code.hfj3.ch1;

public class PhraseOMatic {
    // Method to build a phrase by randomly selecting one word from each of the three word lists
    private static String phraseBuilder(String[] listOne, String[] listTwo, String[] listThree) {

        // Get the length of each list
        int oneLength = listOne.length;
        int twoLength = listTwo.length;
        int threeLength = listThree.length;

        // Generate random indices for each list
        java.util.Random randomNumberGenerator = new java.util.Random();
        int randOne = randomNumberGenerator.nextInt(oneLength);
        int randTwo = randomNumberGenerator.nextInt(twoLength);
        int randThree = randomNumberGenerator.nextInt(threeLength);

        // Construct and return phrase
        return listOne[randOne] + " " + listTwo[randTwo] + " " + listThree[randThree];
    }

    public static void main(String[] a) {

        // Define three lists of words to choose from
        String[] wordListOne = {
                "agnostic", "opinionated", "voice activated", "haptically driven",
                "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"
        };
        String[] wordListTwo = {
                "loosely coupled", "six sigma", "asynchronous", "event driven",
                "pub-sub", "IoT", "cloud native", "service oriented",
                "containerized", "serverless", "microservices", "distributed ledger"
        };
        String[] wordListThree = {
                "framework", "library", "DSL", "REST API", "repository", "pipeline",
                "service mesh", "architecture", "perspective", "design", "orientation"
        };

        // Call the buildPhrase method with the three word lists and store the result
        String phrase = phraseBuilder(wordListOne, wordListTwo, wordListThree);

        // Output the generated phrase to the console
        System.out.println("What we need is a " + phrase);
    }
}