package student;

 class Student {
	private String first_name;
	private String middle_name;
	private String last_name;
	private String suffix;
	
	public Student() {
		
	}
	
	//Getters
	public String getfirstName() {
		return first_name;
	}
	
	public String getmiddleName() {
		return middle_name;
	}
	
	public String getlastName() {
		return last_name;
	}
	
	public String getsuffix() {
		return suffix;
	}
	
	//Setters
	public void setfirstName(String Fname) {
		first_name = Fname;
	}
	
	public void setmiddleName(String Mname) {
		middle_name = Mname;
	}
	
	public void setlastName(String Lname) {
		last_name = Lname;
	}
	
	public void setsuffix(String s) {
		suffix = s;
	}
	
	public String getfullName() {
		return first_name + " " + middle_name + " " + last_name + " " + suffix;
	}
	
	
}
