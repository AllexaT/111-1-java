public class main{
	public static void main(String[] args){
	    int arr[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = {0,0,0,0,0,0,0,0,0};
	    int W=4;//WINDOWS
	    int S=2;//STEP
	    int run=0;//Times
	    int temp=0;
	    int temp2=0;
	    while(run<10){
	        for(int i=temp;i<W+temp;i++){
	            if(i>arr.length-1){
	                break;
	            }
	            arr2[temp2]+=arr[i];
	            System.out.printf("+" + arr[i]);//debug
	        }
	        temp+=S;
	        temp2+=1;
	        run++;
	    }
	    for(int i=0;i<arr2.length-1;i++){
	        System.out.print(arr2[i]+" ");
	    }
	}
}