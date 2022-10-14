import java.util.Scanner;

public class Quiz1{
    public static void main(String[] args){
        int a=1;
		int b=1;
		while(b<6){
			while(a>0){
				System.out.printf("*");
				a-=1;
			}
			System.out.println();
			b+=1;
			a=b;
		}
        
    }
}