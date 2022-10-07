public class Quiz1{
    public static void main(String[] args){
        int grade=0;
        int i=0;
        while(grade<10){
            while(i>0){
                i--;
                System.out.printf(" ");
            }
            System.out.println(grade);
            grade++;
            i=grade;
        }
    }
}