public class StringPalindrome {
    static void main(String[] args) {
        String str = "Mad";
checkPalindrome(str);
    }

    static void checkPalindrome(String str){
        String newString = str.toLowerCase();
        String reversStr ="";
        for(int i = newString.length()-1;i>=0;i--){
            reversStr += newString.charAt(i);
        }
        if(newString.equals(reversStr)){
            System.out.println("The word is palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }


}
