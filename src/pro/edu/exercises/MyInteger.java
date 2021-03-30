package pro.edu.exercises;
/*
  @author   george
  @project   vsem2
  @class  MyInteger
  @version  1.0.0 
  @since 26.03.2021 - 19.10
*/

public class MyInteger {

    public static boolean isPrime(int num){
        // determine is the number prime  or not
        for (int i = 2; i < num; i++) {
            if(num % i == 0)  {
                // is not prime
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(21));  // false
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(31));   // true
        System.out.println(isPrime(1001));  // ??-

    }
}
