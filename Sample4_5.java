class Sample4_5 {
	public static void main(String args[]){
		int count;
		
		for(count = 0; count < 5; count++){
			System.out.println("count = " + count);
		}
		
		System.out.println(count);
		// countはGlobalScopeにないので
		// for( ; ; )、for( ;true; )　無限ループ
	}
}