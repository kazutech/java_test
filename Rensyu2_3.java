class Rensyu2_3 {
	public static void main(String[] args){
		short s1 = 100;
		int i1 = s1;
		int i2 = 100;
		// short s2 = i2;
	}
}

/*
230ページ
小さい値を大きい型に代入できる
大きい値を小さい値に代入できない(キャストが必要）後述
整数リテラルは、int型とみなされる
小数リテラルは、double型とみなされる
	
		int num1 = 10;
	
		long num3 = 1000000000000; ←　intで認識するが範囲を超えるのでエラー Lをつける
	
		float num4 = 10.0; ←　Fをつける
*/