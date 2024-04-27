package complex;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TestYantra {
	
	
	@Id
	private String address;
	
	private long contactno;
	
	
	@OneToMany
	private List<Branches> b;


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getContactno() {
		return contactno;
	}


	public void setContactno(long contactno) {
		this.contactno = contactno;
	}


	public List<Branches> getB() {
		return b;
	}


	public void setB(List<Branches> b) {
		this.b = b;
	}
	
	
	
	

}
