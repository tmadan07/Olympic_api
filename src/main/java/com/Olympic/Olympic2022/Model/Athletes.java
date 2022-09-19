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
	private String FullName;
	
	@Column(name = "country")
	private String Country;
	
	@Column(name = "sport")
	private String Sport;
	
	@Column(name = "totalMedals")
	private String TotalMedals;
	
	public Athletes() {	
	}
	
	public Athletes(String FullName, String Country, String Sport, String TotalMedals) {
		super();
		this.FullName = FullName;
		this.Country = Country;
		this.Sport = Sport;
		this.TotalMedals = TotalMedals;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String Country) {
		this.Country = Country;
	}
	public String getSport() {
		return Sport;
	}
	
	public void setSport(String Sport) {
		this.Sport = Sport;
	}
	public String getTotalMedals() {
		return TotalMedals;
	}
	public void setTotalMedals(String TotalMedals) {
		this.TotalMedals = TotalMedals;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String FullName) {
		this.FullName = FullName;
	}
	

}
