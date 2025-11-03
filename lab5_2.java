//Scenario 1:
public class lab5_2 {
    public static int sumDigits(int n){
        if(n<10){
            return n;
        }
        else{
            return (n % 10) + sumDigits(n / 10);
        }
    }
    public static void main(String[]args){
        System.out.println("sumDigits(305):"+sumDigits(305));
    }
}
