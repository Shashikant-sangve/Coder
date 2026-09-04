class Hard1 {
	public static void main(String[] args) {
		int i = 1;
		if(i++ == ++i && i++ == i++) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
		System.out.println(i);
	}
}
// output : Bye 
//          3