import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		//  Napisati program koji pita korisnika da unese recenicu, a zatim ispisuje predzadnju rijec u datoj recenici.
        //  Input: Never gonna give you up.
       //   Output: you

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = input.nextLine();
	
		String[] s1= s.split(" ");
		if (s1.length > 2) {
			System.out.println(s1[s1.length - 2]);
			
		}

	}

}
