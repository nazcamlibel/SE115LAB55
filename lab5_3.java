//Scenario 2:
public class lab5_3 {
    public static long power(long base, int exp){
        if(exp==0){
            return 1;
        }else{
            return base * power(base, exp -1);
        }
    }
    public static void main(String[]args){
        System.out.println("power(3,4):"+ power(3,4));
    }
}
