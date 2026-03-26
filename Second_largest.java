import java.util.Scanner;
public class Second_largest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
	    System.out.print("Enter size: ");
	        int n = sc.nextInt();
            int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for(int i=0; i<n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;
	        
	        for(int i=0;i<n;i++) {
	        	if(arr[i]>first) {
	        		second = first;
	        		first = arr[i];
	        	}else if(arr[i]>second && arr[i] != first) {
	        		second = arr[i];
	        	}
        }
	        if(second==Integer.MIN_VALUE) {
	        	System.out.println("No Second Largest element (all elements equal or only one element).");
	        }else {
	        	System.out.println("Second Largest: "+second);
	        }
    }
    
}
