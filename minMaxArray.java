import java.util.*;

public class minMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		int minFinal = minArray(arr);
		System.out.print(minFinal + " ");

		int maxFinal = maxArray(arr);	
		System.out.println(maxFinal); 
        sc.close();
    }

    public static int minArray(int outputArr[]) {

        int minValue = outputArr[0];

        for (int i=1; i<outputArr.length; i++) {
            if (outputArr[i] < minValue) {
             minValue = outputArr[i]; 
            }
        }

        return minValue;
    }

    public static int maxArray(int outputArr[]) {

        int maxValue = outputArr[0];

        for (int i=1; i<outputArr.length; i++) {
            if (outputArr[i] > maxValue) {
             maxValue = outputArr[i]; 
            }
        }

        return maxValue;
    }
}