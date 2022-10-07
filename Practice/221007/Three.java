/**************************
 Please use UTF-8 complier
**************************/
import java.util.Scanner;

public class Three{
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("輸入成績(0-100): ");
        a=input.nextInt();
		if(a<101 && a>-1){
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
		}else{
			System.out.println("請輸入正確數字！");
		}
    }
}