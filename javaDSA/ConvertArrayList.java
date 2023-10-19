import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayList {
     public static void main(String[] args) {
        
        String[] array = {"apple", "banana", "cherry"};

        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println(arrayList);
    }
        }


