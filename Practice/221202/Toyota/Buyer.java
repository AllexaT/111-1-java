import java.util.Scanner;

public class Buyer{
	public static void main(String[] args){
		int password=10,car=0;
		Scanner input = new Scanner(System.in);
		Design x86 = new Design();
		Design r33 = new Design();
		System.out.printf("1. Toyota x86\n2. Toyota R33\nPlease Select your Toyota Car: ");
		car = input.nextInt();
		if(car>2){
			password = 10;
		}else{
			System.out.printf("Please Enter your Toyota Key Password:");
			password = input.nextInt();
		}
		if(car==1){
			password = x86.lunch(password,1);
		}else if(car==2){
			password = r33.lunch(password,2);
		}
		for(int i=0;i<1000000000;i++){
			if(i%1000000000==0)
				System.out.printf("Waiting for respoding");
		}
		if(password==1){
			if(car==1){
				System.out.printf("\nToyota x86 is on!");
			}else if(car==2){
				System.out.printf("\nToyota r33 is on!");
			}
		else if(password==10){
			System.out.printf("Wrong Car!");
		}
		}else{
			for(int i=0;i<1000000000;i++){
			if(i%100000000==0)
				System.out.printf("\nWarning! Warning! Warning!");
			}
		}
	}
}