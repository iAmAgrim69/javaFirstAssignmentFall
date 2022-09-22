/**
 * 
 */
package exercise1;

/**
 * @author Agrim
 * 301209752
 */
public class Singers {
	// declaring instance variables
	private int id;
	private String name;
	private String address;
	private String dateOfBirth;
	private int numOfAlbums;

	// setting up setter and getter for each instance variable
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getNumOfAlbums() {
		return numOfAlbums;
	}

	public void setNumOfAlbums(int numOfAlbums) {
		this.numOfAlbums = numOfAlbums;
	}

	public int getId() {
		return id;
	}

	public void setAll(int id, String name, String address, String dateOfBirth, int numOfAlbums) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.numOfAlbums = numOfAlbums;
	}

	// constructors
	public Singers() {
	} // no arguments constructor

	public Singers(int id) {
		this.id = id;
	}

	public Singers(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Singers(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Singers(int id, String name, String address, String dateOfBirth) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public Singers(int id, String name, String address, String dateOfBirth, int numOfAlbums) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.numOfAlbums = numOfAlbums;
	} 
}
