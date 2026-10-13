import java.util.Scanner;

public class StringInput {
    static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your , Full Name : ");
        str = sc.nextLine();
       //str = sc.next();
        System.out.println("   "+str);
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        System.out.println(str.substring(0 ,3));
        System.out.println(str.trim());
        System.out.println(str.contains("Subha"));
        String [] words = str.split(",");
        for(String charr : words){
            System.out.println(charr);

        }


    }
}
