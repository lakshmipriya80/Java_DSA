public class LeftRotateArray {
  public static void main(String[] args) {
    int[] arr = {1,4,5,6,7,8,2};
    int position = 3;
for(int i=0;i<position;i++){
       int j, first; 
        first=arr[0];
         
        for(j=0;j<arr.length-1;j++){
            arr[j]=arr[j+1];
           
        }
       arr[j]=first;
    }
   
for(int i :arr ){
    System.out.print(i + " ");
}

  } 



}
  