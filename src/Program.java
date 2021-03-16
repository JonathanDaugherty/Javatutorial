import library.*;

public class Program {

	public static void main(String[] args) {
		GermanShepherd gs = new GermanShepherd("King", "Woof", 2);
		//gs.birthday();
		
		Collie col = new Collie("Lassie", "Hello", 50);
		
		//Dog[] dogs = new Dog[] {gs, col};
		
		IBirthday[] dogs = new IBirthday[2];
		dogs[0] = gs;
		dogs[1] = col;
		for(IBirthday dog : dogs) {
			System.out.println("The dogs birthday: ");
			dog.birthday();
		}
		
		
		
//		Mathematics math = new Mathematics();
//		int a = 12;
//		int b = 3;
//		System.out.println(math.add(a, b));
//		System.out.println(math.sub(a, b));
//		System.out.println(math.mult(a, b));
//		System.out.println(math.div(a, b));
//		System.out.println(math.mod(a, b));
//		System.out.println(math.pow(a, b));
//	}
	

	}
	
}
