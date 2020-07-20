import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FIleCreator {
    public static void main(String[] args) throws IOException {
        String fileName = "words.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        ArrayList<String> wordList = new ArrayList<>();
        ListFile listFile = new ListFile();
        listFile.setList(wordList);
        int lines = 0;


        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            System.out.println(word);
            listFile.addToList(word);
            lines++;
        }
        sc.close();
        listFile.longestWord();
        listFile.shortestWord();
        listFile.sumALLCharsInArray();
    }
}
