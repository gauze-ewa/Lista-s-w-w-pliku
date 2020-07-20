import java.util.ArrayList;

public class ListFile {
    private ArrayList<String>list;

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
    public void addToList(String word){
        this.list.add(word);
    }

    public void longestWord(){
        String longestString=list.get(0);
        for (String elemesnt: list) {
            if(elemesnt.length()>longestString.length()){
                longestString=elemesnt;
            }
        }
        System.out.println("Najdłuższy wyraz zpliku to: "+longestString);
    }

    public void shortestWord(){
        String shortestWord=this.list.get(0);
        for (String elemant:list) {
            if(shortestWord.length()>elemant.length())
                shortestWord=elemant;
        }
        System.out.println("Najktótszy wyraz to: "+shortestWord);
    }
    public void sumALLCharsInArray(){
        int blackChar = 0;
        for (String elem:list) {
            blackChar+=elem.length();
        }
        System.out.println("Liczba znaków w pliku to: "+blackChar);
    }

}
