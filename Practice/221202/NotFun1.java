public class NotFun1{
	public static void main(String[] args){
			int x=0,y=0;
			int[] t= new int[100];;
			while(x<200000000){
				t[x]=++y;
				x++;
				if(y==9){
					y=0;
				}
				if(x==100){
					x=0;
				}
				System.out.printf("%d",t[x]);
			}
	}
}