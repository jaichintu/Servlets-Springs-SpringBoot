package servlets_basics.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import servlets_basics.dao.EmployeeDao;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String pwd;
	private String dob;
	private String gender;
	private String checkbox;
	private String drop;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	public String getDrop() {
		return drop;
	}
	public void setDrop(String drop) {
		this.drop = drop;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", dob=" + dob
				+ ", gender=" + gender + ", checkbox=" + checkbox + ", drop=" + drop + "]";
	}
	
}
