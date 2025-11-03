//Scenario 0:
    public class lab5_1 {
        public static int factorial(int n){
            if (n==0){
                return 1;
            }else{
                return factorial(n-1)*n;
            }
        }
        public static void main(String[]args){
            System.out.println("Factorial of n is: " + factorial(5));
        }
    }
