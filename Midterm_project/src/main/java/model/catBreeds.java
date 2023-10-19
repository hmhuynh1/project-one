
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lscha
 *
 */
@Entity(name = "catBreeds")
@Table(name = "catBreeds")

public class catBreeds {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;

	private String breeds;
	private String factsAboutCats;
	private double catSize = 0.0;
	
	
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
	public void setFactsAboutCats(String factsAboutCats) {
		this.factsAboutCats = factsAboutCats;
	}
	
	
	public double getCatSize() {
		return catSize;
	}
	public void setCatSize(double catSize) {
		this.catSize = catSize;
	}
	
}