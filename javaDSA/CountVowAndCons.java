
import java.util.*;
public class CountVowAndCons {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        sc.close();
int vow = 0;
int con = 0;

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(c== 'a' || c== 'e' || c=='i' || c=='o' || c=='u'){
          vow++;
            }
            else{
                con++;
            }
        }

        System.out.println(vow);
        System.out.print(con);
    }
}
