package Action_Item_Second;

public class Action_Item_7_5 {

	public static void main(String[] args) {
		int [] num = {8,5,6,3};
		highest(num);

	}

	public static void highest(int [] num) {
		int x=Integer.MIN_VALUE;
		for (int i=0; i<num.length; i++) {
			
			if(num[i]>x) {
				x=num[i];
			}
		}
		System.out.println(x);

	}

}
