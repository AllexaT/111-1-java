public class Test1{
    public static void main(String args[]){
        int temp=0;
        int[] iArr = {7, 3, 4, 9 ,6};
        for(int i=0;i<5*5/2;i++){
            if(iArr[i%4]>iArr[i%4+1]){
                temp=iArr[i%4+1];
                iArr[i%4+1]=iArr[i%4];
                iArr[i%4]=temp; 
            }
        }
        System.out.printf("%d %d %d %d %d",iArr[0],iArr[1],iArr[2],iArr[3],iArr[4]);
    }
}