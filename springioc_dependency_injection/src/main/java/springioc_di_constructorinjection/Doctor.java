package springioc_di_constructorinjection;

public class Doctor {
	
	private String d_name;
	
	private String specilization;
	
	private String clinic_name;
	
	private long landline;

	public Doctor(String d_name, String specilization, String clinic_name, long landline) {
		
		this.d_name = d_name;
		this.specilization = specilization;
		this.clinic_name = clinic_name;
		this.landline = landline;
	}

	@Override
	public String toString() {
		return "Doctor [d_name=" + d_name + ", specilization=" + specilization + ", clinic_name=" + clinic_name
				+ ", landline=" + landline + "]";
	}
	
	
	
	
	

}
