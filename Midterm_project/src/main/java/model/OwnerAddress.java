package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ownerAddress")
@Table(name = "ownerAddress")

public class OwnerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int rowId;
	private String catName = "";
	private String ownerAddress = "";
	private Double ownerPhoneNumber = 0.0;
	
	
	
public OwnerAddress(String catName, String ownerAddresss, Double ownerPhoneNumber) {
		this.setCatName(catName);
		this.setOwnerAddress(ownerAddress);
		this.setOwnerPhoneNumber(ownerPhoneNumber);
}	

public OwnerAddress() {
		this.setCatName("");
		this.setOwnerAddress("");
		this.setOwnerPhoneNumber(0.0);			
	}


public int getRowId() {
	return rowId;
}

public void setRowId(int rowId) {
	this.rowId = rowId;
}

public String getCatName() {
	return catName;
}

public void setCatName(String catName) {
	this.catName = catName;
}


public String getOwnerAddress() {
	return ownerAddress;
}

public void setOwnerAddress(String ownerAddress) {
	this.ownerAddress = ownerAddress;
}


public Double getOwnerPhoneNumber() {
	return ownerPhoneNumber;
}

public void setOwnerPhoneNumber(Double ownerPhoneNumber) {
	this.ownerPhoneNumber = ownerPhoneNumber;
}
}
