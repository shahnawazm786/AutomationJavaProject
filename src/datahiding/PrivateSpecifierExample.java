package datahiding;

// hiding the data
// Specifier - private, protected, public and default
public class PrivateSpecifierExample {

private String adharNo;

private void setAdharNoInaString() {
	this.adharNo="IND-123"+this.adharNo;
}


public void setAdharNo(int adharNo) {
	
	this.adharNo=(String.valueOf(adharNo));
}
public String getAdharNo() {
	setAdharNoInaString();
	return this.adharNo;
}

}


