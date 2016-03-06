package epicInterviewPreparation;

public class glitchWalkingRobot {
	public static void counter(int x, int y, int steps){
		int sum=0;
		int side=0;
		int balance =0;
		int distance =0;
		for(int i=1;i<=steps;i++){
			sum += x*i-x-i;
		}
		//sum = (int) (x-1)*steps*(steps+1)/2- x*steps;
		side = sum/y;
		balance = sum%y;
		if(side%2 == 0){
			distance = balance;
		} else {
			distance = y- balance;
		}
		System.out.println(distance);
	
	}
		public static void main(String[] args){
			counter(3,10,8);
		}

}
