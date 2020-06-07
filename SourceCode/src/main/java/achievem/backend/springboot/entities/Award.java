package achievem.backend.springboot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Award implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String collectionDate;
	
	@NotNull
	private String category;
	
	@NotNull
	private int points;
	
	@ManyToOne
	@JoinColumn(name = "ranking_id", referencedColumnName = "id", nullable = false)
	private Ranking ranking;
	
	public Award(String collectionDate, String category, int points, Ranking ranking) {
		this.collectionDate = collectionDate;
		this.category = category;
		this.points = points;
		this.ranking = ranking;
	}
	
	public Award () {
		
	}
	
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCollectionDate() {
		return this.collectionDate;
	}

	public void setCollectionDate(String collectionDate) {
		this.collectionDate = collectionDate;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Ranking getRanking() {
		return this.ranking;
	} 
	

}
