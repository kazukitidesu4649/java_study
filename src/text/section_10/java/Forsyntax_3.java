package text.section_10.java;

public class Forsyntax_3 {
	public static void main(String[] args) {
		
		// 変数i=1~10の範囲で繰り返す
		for( int i = 1; i < 11; i++ ) {
			
			//ループカウンタが３の時に繰り返し処理をスキップ
			if( i == 3) {
				System.out.println("繰り返し処理に進みます");
				continue;
			}
			
			System.out.println(i);
		}
	}
}
