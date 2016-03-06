package epicInterviewPreparation;

import java.util.Arrays;

public class RGBCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RGBcompare("141423");

	}
	
	public static void RGBcompare(String RGB){
		int R = Integer.parseInt(RGB.substring(0,2), 16);
		int G = Integer.parseInt(RGB.substring(2,4), 16);
		int B = Integer.parseInt(RGB.substring(4,6), 16);
		
		System.out.println("R: " + R + "  G: " + G + "  B: " + B);
		
		int[] arr = {R,G,B};
		
		
		
		if(arr[0] == arr[1] && arr[1] == arr[2]){
			System.out.println("Equal");
		} else if(arr[0] > arr[1] && arr[0] > arr[2]){
			if(arr[1] == arr[2]){
				System.out.println("Red is the greatest, blue and green are equal");
			} else {
				System.out.println("Red is the greatest");
			}
		} else if(arr[1] > arr[0] && arr[1] > arr[2]){
			if(arr[0] == arr[2]){
				System.out.println("Green is the greatest, red and blue are equal");
			} else {
				System.out.println("Green is the greatest");
			}
		} else if(arr[2] > arr[0] && arr[2] > arr[1]){
			if(arr[0] == arr[1]){
				System.out.println("Blue is the greatest, red and green are equal");
			} else {
				System.out.println("Blue is the greatest");
			}
		}
	}

}
