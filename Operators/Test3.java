class Test3 {
	public static void main(String[] args) {
		int a = 2;
		if(a++ == ++a) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}