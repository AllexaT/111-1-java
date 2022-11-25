//印星星
import java.util.Scanner;
public class Test1{
    public static void main(String[] args){
        int km=50,total=85;
        if (km>7)
            total=total+(km-7)*5;
        System.out.printf("NT$%d",total);
    }
}