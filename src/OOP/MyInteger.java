package OOP;

public class MyInteger {
    private int value;

    MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }
    public boolean isPrime(){
        return isPrime(value);
    }
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger myInteger){
        return this.value == myInteger.value;
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return value % 2 != 0;
    }
    public static boolean isPrime(int value){
        if(value <= 1){
            return false;
        }
        if(value == 2){
            return true;
        }
        if(value % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(value); i += 2){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven();
    }
    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }
    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }

    public static int parseInt(char[] chars){
        int result = 0;
        int i = 0;
        boolean negative = false;

        if(chars.length > 0 && chars[0] == '-'){
            negative = true;
            i = 1;  // ← ADD THIS LINE to skip the '-' character
        }
        for (; i < chars.length; i++){
            if(chars[i] < '0' || chars[i] > '9'){
                throw new NumberFormatException("Invalid character: " + chars[i]);
            }
            result = result * 10 + (chars[i] - '0');
        }
        return negative ? -result : result;
    }
    public static int parseInt(String str){
        return parseInt(str.toCharArray());
    }
}
