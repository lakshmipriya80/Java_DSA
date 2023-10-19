
import java.util.Set;
import java.util.HashSet;
public class ConvertSet {
    
    static Set<Integer> convert(int[] array)
    {
        
        Set<Integer> Set = new HashSet<>();
 
      
        for (int element : array) {
            Set.add(element);
        }
        
        return Set;
    }
    
    
	public static void main (String[] args) {
		int array[] = { 1,1,2, 2, 3, 4, 5, 6 };
		Set<Integer> Set = convert(array);
		
		System.out.println("Hash Set Contains :" + Set);
	
	}
}
