package inheritance;

public class student extends citizen {
	private int rollno;
	private String collegename;
	public student() {
		super();
	}
		public student(String name,String aadharno,String address,long phno,int rollno,String collegename) {
		super(name,aadharno,address,phno);
		this.rollno=rollno;
		this.collegename=collegename;
		
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}
		@Override
		public String toString() {
			return "student [rollno=" + rollno + ", collegename=" + collegename + ", name=" + name + ", aadharno="
					+ aadharno + ", address=" + address + ", phno=" + phno + ", getRollno()=" + getRollno()
					+ ", getCollegename()=" + getCollegename() + ", getName()=" + getName() + ", getAadharno()="
					+ getAadharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno() + "]";
		}
		
	

}
