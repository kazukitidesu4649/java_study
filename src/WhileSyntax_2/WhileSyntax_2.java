package WhileSyntax_2;

public class WhileSyntax_2 {
	public static void main(String[] args) {
		
		int dice = 1; // サイコロの目
		int  cnt = 0; // 繰り返し回数
		
		// 6が出るまでサイコロを振り続ける
		while( dice != 6 ) {
			
			// 繰り返し回数が５回以上になったら強制終了
			if( 5 <= cnt ) {
				System.out.println("5回に達したため強制終了します");
				break;
			}
			
			// サイコロを振る
			dice = (int)( Math.ceil( Math.random() * 6 ) );
			System.out.println("サイコロの目は" + dice);
			
			// １回サイコロを振ったので、振り返し回数を１プラス
			cnt++;
		}
	}

}
