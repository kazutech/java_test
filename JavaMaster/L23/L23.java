class L23 {
	public static void main(String args[]){
		int end;
		int baisu;
		int i = 1;
		end = Integer.parseInt(args[0]);
		baisu = Integer.parseInt(args[1]);
		while(i <= end){
			if(i % baisu == 0) System.out.println(i);
			i++;
		}
	}
}