package nestedfor;

public class nestloop {

	public static void main(String[] args) {


	// TODO Auto-generated method stub
		String a = "$";
		int i = 0;
		while (i <= 5) {
			if ( i == 0 || i == 5) {
				System.out.println(a +" " + a +" " + a +" " + a + " " + a );
			}
			else System.out.println(a +" " + " " +" " + " " +" " + " " + " " + a );
			i++;
		}
	}

}
