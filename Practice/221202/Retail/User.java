import java.util.Scanner;
public class User{
	public static void main(String[] args){
		int number=0,key=0;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter Number you want to produce:");
		number=input.nextInt();
		Car[] myCar = new Car[number];
		System.out.printf("Enter key:");
		key=input.nextInt();
		for(int x=0;x<number;x++){
			myCar[x]=new Car();
			myCar[x].wheel1=x;
			myCar[x].wheel2=x+1;
			myCar[x].wheel3=x+2;
			myCar[x].wheel4=x+3;
			if(myCar[x].launch(key)==1){
				System.out.printf("CAR,W1,W2,W3,W4:%d\t%d\t%d\t%d\t%d\n",x,myCar[x].wheel1,myCar[x].wheel2,myCar[x].wheel3,myCar[x].wheel4);
				//System.out.printf("CAR,W1,W2,W3,W4:%d %d %d %d %d",x,myCar[x].wheel1,myCar[x].wheel2,myCar[x].wheel3,myCar[x].wheel4);
			}else{
				System.out.printf("Wrong key");
				break;
			}
		}
	}
}