public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(3));
        System.out.println(triangularNumber(3));
        System.out.println(reverseString("dennis"));
        System.out.println(revStr("dennis"));
    }

    public static String revStr(String str) {
        String revStr = "";

        if (str.length() == 1) {
            return str;
        }
        revStr = revStr.concat(String.valueOf(str.charAt(str.length()-1)));
        revStr = revStr.concat(revStr(str.substring(0,str.length()-1)));

        return revStr;
    }

    public static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }

    public static int fibonacci(int num) {
        if (num == 1) {return num;}
        if (num == 0) {return num;}
        return fibonacci(num - 1) + fibonacci(num -2);
    }

    public static int triangularNumber(int num) {
        if (num == 1) {
            return num;
        }
        return num + triangularNumber(num -1);
    }

    public static String reverseString(String word){
        String wordReversed = "";

        if (word.length() == 1){
            return word;
        } else {
            wordReversed = wordReversed.concat(String.valueOf(word.charAt(word.length() - 1)));
            wordReversed = wordReversed.concat(reverseString(word.substring(0,word.length() - 1)));
        }
        return wordReversed;
    }
}
