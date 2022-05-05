
package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bucket")
public class NewExpanse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private int expanseId;
	@Column
	private String expanseDate;
	@Column
	private String Description;
	@Column
	private String Location;
	@Column
	private int Category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExpanseId() {
		return expanseId;
	}
	public void setExpanseId(int expanseId) {
		this.expanseId = expanseId;
	}
	public String getExpanseDate() {
		return expanseDate;
	}
	public void setExpanseDate(String expanseDate) {
		this.expanseDate = expanseDate;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getCategory() {
		return Category;
	}
	public void setCategory(int category) {
		Category = category;
	}

}
