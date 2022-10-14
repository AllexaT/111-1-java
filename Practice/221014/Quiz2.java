public class Quiz2{
    public static void main(String[] args){
        int a=0,c=0;
		while(c<5*2-1){
			a=++c;
			if(a>5)
				a=5*2-a;
			while(a>0){
				System.out.printf("*");
				a-=1;
			}
			System.out.println();
		}
    }
}