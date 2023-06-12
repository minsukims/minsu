package Ch99;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
	Scanner star = new Scanner(System.in);
	System.out.print("찍고 싶은 별의 높이값을 설정해주세요>>>");
	int height = star.nextInt();
	
	for(int i=0;i<height;i++) {
		for(int j=0;j<height-(i+1);j++) {
			System.out.print(" ");
		}
		for(int k=0;k<2*i+1;k++) {
			System.out.print("*");
		}
		
		
		System.out.println();
	}
	
	}
}
