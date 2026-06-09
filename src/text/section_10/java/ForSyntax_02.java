package text.section_10.java;

public class ForSyntax_02 {
	public static void main(String[] args) {
		
		// 変数i=1~10の範囲で繰り返す
		for( int i = 1; i < 11; i++) {
			System.out.println(i);
			// ループカウンタが5のときに繰り返し処理を強制終了
			if( i == 5) {
				System.out.println("繰り返し処理を強制終了します");
				break;
			}
		}

	}

}
