package Lession1;

public final class Student {
	int id;
    String name;
	static int NoOfStudents=0;
	

	Student(){
		NoOfStudents++;
		}
	
	public static int GetNoOfstudents() {
		return NoOfStudents;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
