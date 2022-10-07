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
	if(a>100)
	    System.out.println("請重新輸入");
        else if(a>89)
            System.out.println("A");
        else if(a>79)
            System.out.println("B");
        else if(a>69)
            System.out.println("C");
        else if(a>59)
            System.out.println("D");
        else if(a>-1)
            System.out.println("E");
        else
            System.out.println("請重新輸入!");
    }
}