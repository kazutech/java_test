class CheckYear {
	boolean check(int y) {
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
class L34 {
	public static void main(String args[]){
		int i;
		int year;
		for(i = 0;i < args.length; i++) {
			year = Integer.parseInt(args[i]);
			CheckYear myYear = new CheckYear();
			if(myYear.check(year)) {
				System.out.println(year + "年はうるう年です");
			} else {
				System.out.println(year + "年はうるう年ではありません");
			}
		}
	}
}