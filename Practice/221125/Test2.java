import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		int x[]=new int[50000],y[]=new int[50000],newx[]=new int[50000],newy[]=new int[50000],runtimes=0,total=0;
		Scanner input=new Scanner(System.in);
		runtimes=input.nextInt();
        for(int i=0;i<runtimes;i++){
            x[i]=input.nextInt();
            y[i]=input.nextInt();
            newx[i]=input.nextInt();
            newy[i]=input.nextInt();
        }
        for(int i=0;i<runtimes;i++){
            for(int j=0;j<(newx[i]+newy[i]);j++){
                total+=j;
            }
            total+=((newy[i]+newx[i])+newx[i]);
            for(int j=0;j<(x[i]+y[i]);j++){
                total-=j;
            }
            total-=((x[i]+y[i])+x[i]);
            System.out.printf("Case %d: %d\r\n",i+1,total);
            total=0;
        }
	}
}