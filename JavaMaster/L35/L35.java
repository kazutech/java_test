class Seiseki {
	private int goukei;
	double heikin;
	void calcGoukei(int su) {
		goukei += su;
	}
	int getGoukei() {
		return goukei;
	}
	void calcHeikin() {
		heikin = goukei / 4;
	}
}

class L35 {
	public static void main(String args[]) {
		Seiseki obj = new Seiseki();
		for(int i = 0; i < 4; i++) {
			obj.calcGoukei(Integer.parseInt(args[i]));
		}
		obj.calcHeikin();
		System.out.println("‡Œv:" + obj.getGoukei());
		System.out.println("•½‹Ï:" + obj.heikin);
	}
}