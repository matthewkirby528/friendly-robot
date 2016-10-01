/**
 * Created by mkirby528 on 10/1/2016.
 */
public class prob7 {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 0; x <=1000000000; x++){
            if (isPrime(x)){
                count++;
                if (count == 10001) {
                    System.out.println(x);
                    System.exit(0);
                }
        }

        }
    }
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

}
