public class Design{
	public int WheelR1=0;
	public int WheelR2=0;
	public int WheelL1=0;
	public int WheelL2=0;
	public int lunch(int key,int car){
		if((car==1&&key==36)||(car==2&&key==66)){
			return 1;
		}else{
			return 0;
		}
	}
}