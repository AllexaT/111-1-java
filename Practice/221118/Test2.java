//印星星
import java.util.Scanner;
public class Test2{
    public static void main(String[] args){
        //col為當前第幾行,setting則是設定要多大的菱形,runtimes是總運行次數,star是當前排星星顯示數
        int col=0,setting=0,star=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter NUMBER:");
        setting=input.nextInt();
        star=setting;
        for(int runtimes=0;runtimes<(setting*2+1)*(setting*2-1);runtimes++){//計算總運行次數
            if(runtimes%(setting*2+1)==0 && runtimes!=0){//換行後的動作
                if(col<setting-1){
                    star-=1;
                }else{
                    star++;
                }
                System.out.println();
                col++;
            }
            if(runtimes%(setting*2+1)<star || runtimes%(setting*2+1)>=star+(setting-star)*2+1){//顯示星星
                System.out.printf("*");
            }else{//顯示空格
                System.out.printf(" ");
            }
        }
    }
}