package Module1;
import java.util.*;

public class ObjectofArray {
    public static void main(String[] args) {
        System.out.println("Enter the temperatures recorded");
        Scanner sc = new Scanner(System.in);
        int []days=new int[10];
        int i,num=0;
        float total=0;
        for (i=0;i< days.length;i++){
            days[i]=sc.nextInt();
            total+=days[i];
        }
        float average=total/i;
        for(int d: days){
            if(d>=average)
                num++;
            }
           System.out.println("Average="+average);
           System.out.println("no of days greater than average="+num);

        }
    }



