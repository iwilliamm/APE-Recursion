public class Main {

    public static void main(String[] args) {

        System.out.println("Factorial : input 5 : Answer : " + factorial(5));
        System.out.println("Sum to number : input 5 : Answer :" + sum_To_Number(5));
        System.out.println("Add : input 5 , 5 : Answer :" + add(5,5));
        System.out.println("Fibonacci  : input 5 : Answer :" + fib(5));
        System.out.println("Palindrome  : input racecar : Answer :" + recursivePalindrome("racecar") + " \nAnd one that is not a  Palindrome : input hue : Answer : " + recursivePalindrome("hue"));
        System.out.println("Bunny Ears : input 5 : Answer : " + bunnyEars2(5) );
        System.out.println("Count 7s : input 717 : Answer : " + count_7s(717) );
        System.out.println("Count Xs : input xxx : Answer : " + count_Xs("xxx") );
        System.out.println("Change \"pi\" to 3.14 : input piMApi : Answer : " + change_To_Pi("piMApi") );




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

    private static int bunnyEars2(int bunnies) {
    if(bunnies == 0)
        return 0;
        if(bunnies % 2 == 0)
            return ( 3 + bunnyEars2( bunnies-1 ) );
        else
            return ( 2 + bunnyEars2( bunnies-1 ) );

    }

    private static int count_7s( int n ){
        if ( n < 1 )
            return 0;
        if( n %10 == 7)
            return 1 + count_7s( n/10);
        else
            return count_7s(n/10);

    }

    private static int count_Xs( String word){
        if(word.length() == 0)
            return 0;
        if (word.charAt(0) == 'x') return 1 + count_Xs(word.substring(1));
        return count_Xs(word.substring(1));
    }

    private static String change_To_Pi(String str){

        if ( str.equals("") || str.length() < 2 )
            return str;
        if( str.charAt(0) == 'p' && str.charAt(1) == 'i') return "3.14" + change_To_Pi(str.substring(2));
        return str.charAt(0) + change_To_Pi(str.substring(1));
    }
    private static int triangle(int n){
        if ( n == 0 )
            return 0;
        else return (n + triangle(n-1));
    }
    static String noX(String str) {

        if ( str.equals("") )
            return str;
        if ( str.charAt(0) == 'x' )
            return noX(str.substring(1));
        else
            return str.charAt(0) + noX(str.substring(1));

    }

}
