import java.util.*;
public class String_re {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String");
    
        String abc = scan.next();
        String rev = "" ;
        System.out.println(abc);
        for(int i=0;i<abc.length();i++)
        {
            System.out.println(abc.charAt(i));
            rev = abc.charAt(i) + rev ;

        }
        System.out.println(rev.trim());

        if (abc.equals(rev))
        {
            System.out.println("YEs it is ");
        }
        else
        {
            System.out.println("NO");
        }
    }
}