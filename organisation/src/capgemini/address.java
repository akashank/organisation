package capgemini;

public class address {
	
	private String Line1;
	private String Line2;
	private String City;
	private String State;
	private String Country;
	private int PinCode;
	
	public address(String lLine1, String line2, String city, String state, String country, int pinCode) {
		super();
		this.Line1 = lLine1;
		Line2 = line2;
		City = city;
		State = state;
		Country = country;
		PinCode = pinCode;
	}
	
	public String getlLine1() {
		return Line1;
	}
	public void setlLine1(String lLine1) {
		this.Line1 = Line1;
	}
	public String getLine2() {
		return Line2;
	}
	public void setLine2(String line2) {
		Line2 = line2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPinCode() {
		return PinCode;
	}
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
	@Override
	public String toString() {
		return "address [lLine1=" + Line1 + ", Line2=" + Line2 + ", City=" + City + ", State=" + State + ", Country="
				+ Country + ", PinCode=" + PinCode + "]";
	}
	
	

}
