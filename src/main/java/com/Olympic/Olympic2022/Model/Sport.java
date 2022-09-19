package com.Olympic.Olympic2022.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sports")
public class Sport {
     
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
     
    @Column(name = "word", unique = true, length = 1)
    private String word;
    
    @Column(name = "game", nullable = false, length = 50)
    private String game;
     
    public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
    
    public Sport() {	
	}
}
