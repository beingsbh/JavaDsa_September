public class ReverseString {
    static void main(String[] args) {
        String str = "Subha";
        System.out.println(   reverseString(str));
    }

    static String reverseString(String str){

        String revstr = "";
        for(int i = str.length()-1;i>=0;i--){

           revstr = revstr + str.charAt(i);
        }

return revstr;
    }

}
