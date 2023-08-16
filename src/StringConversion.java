import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        Conversion(s);
    }


    public static  void Conversion(String s)
{
        int num=0;
       for(int i=0;i<s.length();i++)
       {
         num=num*10 +((int)s.charAt(i) - 48);;
       }
        System.out.println(num);
    }


}
