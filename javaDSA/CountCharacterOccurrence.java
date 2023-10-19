public class CountCharacterOccurrence {
    public static void main(String[] args) {
        String str = "Lakshmipriya";
        char find = 'a';
        int count = 0;

        for(char c : str.toCharArray()){
            if(c==find){
                count++;
            }
        }

        System.out.println(count);
    }
}
