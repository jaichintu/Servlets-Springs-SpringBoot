package complex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branches {
	
	
	@Id
	private String bname;
	private String barea;
	
	@ManyToOne
	Qspiders q;
	
	@ManyToOne
	Jspiders j;
	
	@ManyToOne
	Pyspiders p;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBarea() {
		return barea;
	}
	public void setBarea(String barea) {
		this.barea = barea;
	}
	public Qspiders getQ() {
		return q;
	}
	public void setQ(Qspiders q) {
		this.q = q;
	}
	public Jspiders getJ() {
		return j;
	}
	public void setJ(Jspiders j) {
		this.j = j;
	}
	public Pyspiders getP() {
		return p;
	}
	public void setP(Pyspiders p) {
		this.p = p;
	}
	
	

}
