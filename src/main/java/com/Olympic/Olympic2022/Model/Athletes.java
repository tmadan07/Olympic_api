package com.Olympic.Olympic2022.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="athletes")
public class Athletes {
	@Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	
	private long id;
	
	@Column(name = "fullname")
	private String fullname;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "sport")
	private String sport;
	
	@Column(name = "totalMedals")
	private int totalMedals;
	
	@Column(name = "image")
	private String image;
	
	public Athletes() {	
	}
	
//	public Athletes(String fullname, String country, String sport, int totalMedals) {
//		super();
//		this.fullname = fullname;
//		this.country = country;
//		this.sport = sport;
//		this.totalMedals = totalMedals;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getTotalMedals() {
		return totalMedals;
	}

	public void setTotalMedals(int totalMedals) {
		this.totalMedals = totalMedals;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void set(int i, Athletes athletes) {
		// TODO Auto-generated method stub
		
	}
	
	
}
