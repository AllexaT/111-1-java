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
		switch (a/10){
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
			
		}
/*if(a>100)
            System.out.println("你的手有問題!");
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
            System.out.println("你要去看醫生了");
*/
/*      
  下方題目可作為學科陷阱題
  
        if(a>=60)
            if(a>=70)
                System.out.println("good");
        else
             System.out.println("bad");
         
*/
        System.out.printf("\nv2.2\n");
    }
    public static void Nameshow(String str){
        System.out.println("My name is " + str);
    }
}