import java.util.*;
public class DuplicateElement {
    public static void main(String[] args) {
        
        String str = "lakshmipriya";

        Map <Character ,Integer> charcount = new HashMap<>();

        for(Character c: str.toCharArray()){
            if(Character.isLetter(c)){
                charcount.put(c,charcount.getOrDefault(c, 0)+ 1);
            }
        }
System.out.println(charcount);

        for (char c : charcount.keySet()) {
            if (charcount.get(c) > 1) {
                System.out.println(c + " : " + charcount.get(c));
            }
    }
}
}
