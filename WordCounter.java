import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        String sentence = getSentenceInput();
        int result = countWords(sentence);

        System.out.println("Number of words: " + result);

    }
    public static String getSentenceInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        return scan.nextLine(); 

    }
    public static int countWords(String sentence){
        String[] word= sentence.trim().split("\\s");
        return word.length;
    }
}
