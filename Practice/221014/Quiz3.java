public class Quiz3{
    public static void main(String[] args){
        int a=0,b=0,c=5,d=0;//c控制數量
		d=c;
		while(b<c){
			a=++b;
			d=c-a;
			while(d>0){
				System.out.printf(" ");
				d--;
			}
			a=a*2-1;
			while(a>0){
				System.out.printf("*");
				a-=1;
			}
			System.out.println();
		}
    }
}