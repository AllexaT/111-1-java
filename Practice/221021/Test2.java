public class Test2{
    public static void main(String[] args){
        int row=0,number=1,star=5;
        for(int Runtimes=0;Runtimes<6*6;Runtimes++){
            row=Runtimes/6;
            if(Runtimes%6==0 &&Runtimes!=0){
                System.out.println();
                row+=1;
                star-=1;
                number=1;
            }
            if(Runtimes%6<star){
                System.out.printf("*");
            }else{
                System.out.printf("%d",number);
                number++;
            }
        }
    }
}