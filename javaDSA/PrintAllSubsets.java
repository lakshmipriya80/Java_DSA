import java.util.*;
public class PrintAllSubsets {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};

List<List<Integer>> generateSubset = generateSubset(arr);

for (List<Integer> subset : generateSubset) {
    System.out.println(subset);
}

    }



    public static List<List<Integer>> generateSubset(int [] arr){

int n = arr.length;
List<List<Integer>> subsets = new ArrayList<>();

for(int i=0; i<( 1<< n);i++ ){

    List<Integer> subset = new ArrayList<>();

    for (int j=0; j<n;j++){
        if((i &(1 << j))>0 ){
        subset.add(arr[j]);
        }
    }

    subsets.add(subset);
}
return subsets;
    }
}
