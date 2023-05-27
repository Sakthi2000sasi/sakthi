package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()
public class studentdto {
	@Id
	private int sid;
	private String sname;
	private String gender;
	private long phone_no;
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "studentdto [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", phone_no=" + phone_no + "]";
	}

}
