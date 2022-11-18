//class與static的理解

public class Test1{
    public static void main(String[] args){
        Design1 Dadd = new Design1();
        int a=0;
        int c=0;
        c=Dadd.add(a, 2);
        System.out.print(c);

    }
}

class Design1{
    public int add(int x,int y){
        return x+y;
    }
}