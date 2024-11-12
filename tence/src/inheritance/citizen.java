package inheritance;



public class citizen {
	public String name;
	public String aadharno;
	public String address;
	public long phno;
	public citizen() {
		System.out.println("citizen object created");
	}
	public citizen(String name,String aadharno,String address,long phno) {
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phno = phno;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
	


}
