//find the next greater element in the array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[]arr={4,7,3,4,8,1};
		int[]a=new int[arr.length];
		for(int i=0;i<arr.length;i++){
		    int count=0;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]<arr[j]){
		            a[i]=arr[j];
		            count++;
		            break;
		        }
		    }
		    if(count==0){
		        a[i]=-1;
		    }
		}
		System.out.println(Arrays.toString(a));
		
	}
}


