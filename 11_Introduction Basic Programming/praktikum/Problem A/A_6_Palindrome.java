public class A_6_Palindrome {

    public static boolean palindrome(String value){
        //your code here
        int startIdx = 0;
        int endIdx = value.length() - 1;
        while(startIdx < endIdx)
        {
            char start = value.charAt(startIdx);
            char end = value.charAt(endIdx);
            if(Character.toLowerCase(start) != Character.toLowerCase(end))
                return false;
            startIdx += 1;
            endIdx -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic")); //true
        System.out.println(palindrome("katak")); //true
        System.out.println(palindrome("kasur rusak")); //true
        System.out.println(palindrome("kupu-kupu")); //false
        System.out.println(palindrome("lion")); // false
    }
}