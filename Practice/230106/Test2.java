public class main{
	public static void main(String[] args){
		int x = 10;
		double y = 10.0;
		System.out.println("x"+setV(x));
		System.out.println("x,y"+setV(x,3));
		System.out.println("y"+setV(y));
		int total = 0 ;
		for(String str : args){
			total += Integer.parseInt(str);
			System.out.println("args[]" + str);
		}
		System.out.println("total"+total);
	}
	
	public static int setV(int x){
		return 20;
	}
	
	public static int setV(double y){
		return 40;
	}
	
	public static int setV(int x,double y){
		return 87;
	}
}