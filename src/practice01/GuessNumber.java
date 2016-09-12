package practice01;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		Random r = new Random();
		
		while(true) {
			int a=1;
			int b=100;
			int k = r.nextInt(100) + 1;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");

			for( int i = 1; 1 < b; i++ ) {
				System.out.println( a + "-" + b );
				System.out.print( i + ">>" );
				int g = scanner.nextInt();
				
				if( g == k ) {
					System.out.println("맞았습니다.");
					break;
				} else if ( g < k ) {
					a = g;
					System.out.println("더 높게");
				} else if ( k < g ) {
					b = g;
					System.out.println("더 낮게");
				}
			}
			
			System.out.print("다시하겠습니까(y/n)>>");
			String answer = scanner.next();
			if ( answer.equals("y")) {
			} else {
				break;
			}
		}
		
		scanner.close();
	}
}
