package com.Olympic.Olympic2022.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="medals")
public class Medals {

	@Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
   @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	
	private long id;
	
	@Column(name = "rank")
	private int rank;
	
	@Column(name = "country")
	private String country;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "gold")
	private int gold;
	
	@Column(name = "silver")
	private int silver;
	
	@Column(name = "bronze")
	private int bronze;
	
	@Column(name = "total")
	private int total;
	
	public Medals() {	
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getBronze() {
		return bronze;
	}

	public void setBronze(int bronze) {
		this.bronze = bronze;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
