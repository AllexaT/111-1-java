public class Quiz3ans{
    public static void main(String[] args){
        int a=0,b=0,c=5,d=0;//c控制數量
		String star = "*";
		d=c;
		while(b<c){
			a=++b;
			d=c-a;
			while(d>0){
				System.out.printf(" ");
				d--;
			}
			System.out.print(star);
			star = star + "**";
			System.out.println();
		}
    }
}