public class PerfectSquar {
    
        public static void main(String[] args) {
            int number = 16; 
    
            if (isPerfectSquare(number)) {
                System.out.println(number + " is a perfect square.");
            } else {
                System.out.println(number + " is not a perfect square.");
            }
        }
    
        public static boolean isPerfectSquare(int number) {
            int sqrt = (int) Math.sqrt(number);
            return sqrt * sqrt == number;
        }
    }
    

