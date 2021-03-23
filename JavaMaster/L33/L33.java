class Logon {
	int m_id[] = {100,200,300,400,500};
	int m_pass = 12345;
	void chLogon(int id,int pass) {
		int i;
		for(i = 0;i < 5;i++){
			if(m_id[i] == id) {
				break;
			}
			if(i >= 5) {
				System.out.println("ログイン失敗：ID入力エラー");
			} else if (i < 5 && m_pass == pass) {
					System.out.println("ログオン成功");
			} else {
					System.out.println("ログオン失敗：パスワードエラー");
			}
		}
	}
}

class L33 {
	public static void main(String args[]){
		if(args.length == 0) System.exit(0);
		Logon obj = new Logon();
		obj.chLogon(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}