package Action_Items;

public class Q5 {

	public static void main(String[] args) {
		// Q5. Write a program that displays the following pattern using a loop:
		//*
		//* * *
		//* * * * *
		//* * * * * * *
		for (int i=1; i<=4; i++) {
			for(int j = 1; j<=i*2-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}		System.out.println("--------");
		//* * * * * * *
		//* * * * *
		//* * *
		//*
		for (int a = 1; a<=4; a++) {
			for (int b = 7; b>=a*2-1; b--) {
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println("----------");
		//      *
		//    * * *
		//  * * * * *
		//* * * * * * *
		for (int x = 1; x<=4; x++) {
			for(int z = x; z<=4;z++) {
				System.out.print("  ");
			}
			for (int y = 1; y<=x*2-1; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
