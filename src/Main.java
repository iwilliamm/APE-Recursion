public class Main {

    public static void main(String[] args) {

        System.out.println(" Factorial : input 5 : Answer : " + factorial(5));
        System.out.println("Sum to number : input 5 : Answer :" + sum_To_Number(5));
        System.out.println("Add : input 5 , 5 : Answer :" + add(5,5));
        System.out.println("Fibonacci  : input 5 : Answer :" + fib(5));
        System.out.println("Palindrome  : input racecar : Answer :" + recursivePalindrome("racecar") + " \n And one that is not a  Palindrome : input hue : Answer : " + recursivePalindrome("hue"));

    }
    public static boolean recursivePalindrome(String str){
        return validatePalindrome(str, 0, str.length() - 1);
    }

    private static boolean validatePalindrome(String str, int start, int stop){
        return stop - start < 2 ||
                str.charAt(start) == str.charAt(stop) &&
                        validatePalindrome(str, start + 1, stop - 1);
    }


    private static int factorial( int n ){

        if ( n <= 1 ) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    private static int sum_To_Number(int n){
        if (n < 1){
            return 0;
        }else{
            return (n + sum_To_Number(n-1));
        }
    }

    private static int add( int a , int b ){
        if( a == 0){
            return b;
        }else return add(a-1, b+1);
    }

    private static int fib( int n ){
        if( n <= 1 )
            return n;
        else return (fib(n-1) + fib(n-2));

    }


}
