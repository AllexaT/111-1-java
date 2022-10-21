public class Test1{
    public static void main(String[] args){
        int star=0,ans=5;
		for(int row=1;row<ans*2;row++){
			star=row;
			if(star>ans){
				star=ans*2-star;
			}
			for(int space=ans-star;space>0;space--){
				System.out.printf(" ");
			}
			star=star*2-1;
			for(int j=star;j>0;j--){
				System.out.printf("*");
			}
			System.out.println();
		}
    }
}