package exercise1;
/**
 * @author Agrim
 * 301209752
 */
public class Program {

	public static void printAllValues(Singers s){
		System.out.printf("%nID: %d%n",s.getId());
		System.out.printf("Name: %s%n",s.getName());
		System.out.printf("Address: %s%n",s.getAddress());
		System.out.printf("Date Of Birth: %s%n",s.getDateOfBirth());
		System.out.printf("Number of albums: %d%n%n",s.getNumOfAlbums());
	}
	public static void main(String[] args) {
		// creating new Singers instance
		Singers singer1 = new Singers();
		
		//printing the default values
		System.out.printf("%nThe default ID is: %d%n",singer1.getId());
		System.out.printf("The default Name is: %s%n",singer1.getName());
		System.out.printf("The default Address is: %s%n",singer1.getAddress());
		System.out.printf("The default Date Of Birth is: %s%n",singer1.getDateOfBirth());
		System.out.printf("The default Number of albums is: %d%n%n",singer1.getNumOfAlbums());
		
		//setting values
		singer1.setId(1);
		singer1.setName("Rajesh Dai");
		singer1.setAddress("69 Hogwarts Ave.");
		singer1.setDateOfBirth("1969-06-09");
		singer1.setNumOfAlbums(420);
		
		//printing newly set variables
		System.out.printf("%nID: %d%n",singer1.getId());
		System.out.printf("Name: %s%n",singer1.getName());
		System.out.printf("Address: %s%n",singer1.getAddress());
		System.out.printf("Date Of Birth: %s%n",singer1.getDateOfBirth());
		System.out.printf("Number of albums: %d%n",singer1.getNumOfAlbums());
		
		//creating with constructors
		Singers singer2 = new Singers(2);
		Singers singer3 = new Singers(3,"Ed Sheeran");
		Singers singer4 = new Singers(4,"21 Guns","Broken Dreams Blvd");
		Singers singer5 = new Singers(5,"Eminem","Slim Shade","1972-11-15");
		Singers singer6 = new Singers(6,"Sajin Maharzan","Chowk Tira","1998-05-19",4);
		
		//printing values of all the class instances
		printAllValues(singer2);
		printAllValues(singer3);
		printAllValues(singer4);
		printAllValues(singer5);
		printAllValues(singer6);

		

		
		
	}

}
