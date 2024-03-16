import java.util.Arrays;
import java.util.List;

public class CheckWord {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        List<Character> temp = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for(int i=0; i<firstWord.length(); i++){
            char ch = firstWord.charAt(i);
            int index = temp.indexOf(ch);
            num1 = (num1*10) + index;
        }
        for(int i=0; i<secondWord.length(); i++){
            char ch = secondWord.charAt(i);
            int index = temp.indexOf(ch);
            num2 = (num2*10) + index;
        }
        for(int i=0; i<targetWord.length(); i++){
            char ch = targetWord.charAt(i);
            int index = temp.indexOf(ch);
            num3 = (num3*10) + index;
        }
        return (num1+num2)==num3;
    }
}
