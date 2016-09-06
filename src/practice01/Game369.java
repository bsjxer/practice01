package practice01;

public class Game369 {
	public static void main(String[] args) {
		for( int number = 1; number < 100; number++ ) {
			String s = String.valueOf(number);
			int clapCount = 0;
			
			for( int i = 0; i < s.length(); i++ ) {
				char c = s.charAt(i);
				
				if( c == '3' || c == '6' || c == '9' ) {
					clapCount++;
				}
			}
			
			if( clapCount > 0 ) {
				System.out.print(number + " ");
				
				for( int i = 0; i < clapCount; i++ ) {
					if( i+1 != clapCount ) {
						System.out.print("짝");
					} else {
						System.out.println("짝");
					}
					
				}
			}
		}
			
//		for( int number = 1; number < 100; number++ ) {
//			String s = String.valueOf(number);
//			int clapNumber = 0;
//
//			
//			if( number < 10 ) {
//				char c = s.charAt(0);
//				if( c % 3 == 0) {
//					clapNumber++;
//				}
//				if( clapNumber > 0 ) {
//						System.out.println( number + " 짝" );
//				}
//			} else {
//				char c1 = s.charAt(0);
//				char c2 = s.charAt(1);
//				if(c2=='0'){		//c2==0 : 해서 40,50 에서 0이 카운트가 됨. 문자열이랑 정수를 비교하지 않는다
//					c2 = '1';
//				}
//				
//				if( c1 % 3 == 0 && c2 % 3 == 0 ) {		// 그렇지만 문자열에 나머지를 구할때는 가능 하나 보다
//					clapNumber = 2;
//				} else if( c1 % 3 == 0 || c2 % 3 == 0 ) {
//					clapNumber = 1;
//				}
//				if( clapNumber > 0 ) {
//					System.out.print( number + " " );
//					for( int i = 0; i < clapNumber;) {
//						System.out.print("짝");
//						i++;
//						if( i == clapNumber ) {
//							System.out.println();
//						}
//					}
//				}
//				
//			}
//		}
	}
}	