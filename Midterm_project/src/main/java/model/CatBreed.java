package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CatBreeds")
@Table (name = "CatBreeds")

public class CatBreed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;
	
	private String breeds;
	private String factsAboutCats;
	private double size;
	

	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	
	public String getBreeds() {
		return breeds;
	}

	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}

	public String getFactsAboutCats() {
		return factsAboutCats;
	}

	public void setFactsAboutCats(String FactsAboutCats) {
		this.factsAboutCats = FactsAboutCats;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	}

	