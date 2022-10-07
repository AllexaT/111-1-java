/**************************
 Please use UTF-8 complier
**************************/
import java.util.Scanner;

public class One{
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("輸入成績: ");
        a=input.nextInt();
        else if(a>89 && a<101)
            System.out.println("甲等!");
        else if(a>79)
            System.out.println("乙等!");
        else if(a>69)
            System.out.println("丙等!");
        else if(a>59)
            System.out.println("丁等!");
        else if(a>-1)
            System.out.println("好笨!");

    }
}