public class Main {
    //Scenario 0:
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    //Scenario 1:
    public static int sumDigits(int n){
        if(n<10){
            return n;
        }
        return (n%10)+ sumDigits(n/10);
    }
    //Scenario 2:
    public static long power(int base, int exp){
        if(exp==0){
            return 1;
        }
        return base*power(base,exp-1);
    }
    //BONUS!!:
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args){ //Calling...
        //Scenario 0:
        System.out.println(factorial(4));
        //Scenario 1:
        System.out.println(sumDigits(305));
        //Scenerio 2:
        System.out.println(power(3,4));
        //BONUS!!
        System.out.println(fib(5));
    }
}