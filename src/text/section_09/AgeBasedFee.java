package text.section_09;

public class AgeBasedFee {
	public static void main(String[] args) {
		
		// 0~9のいずれかをランダムに生成
		int ageGroup = 30;//年齢
		int fee;

		// 乱数randNumの値を出力
		
		fee = switch(ageGroup) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30, 40 -> 3000;
			case 50 -> 4000;
			default -> 500;		// 上記以外の年代
		};
		
		System.out.println(ageGroup + "代の料金は" + fee + "円");
	}
}
