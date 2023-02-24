public class Myarray{
	public static void main(String[] args){
		Human human = new Human();
		human.printheight();
	}
}

class Human{
	int sex;
	private int weight=90;
	static int height=0;

	public static void printheight(){
		System.out.print(height);
	}

	public void printweight(){
		System.out.print(weight);
	}
}