package achievem.backend.springboot.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Award implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private Date collectionDate;
	
	@NotNull
	private String category;
	
	@NotNull
	private int points;
	
	@ManyToOne
	@JoinColumn(name = "ranking_id", referencedColumnName = "id", nullable = false)
	private Ranking ranking;
	
	public Award(Date collectionDate, String category, int points, Ranking ranking) {
		this.collectionDate = collectionDate;
		this.category = category;
		this.points = points;
		this.ranking = ranking;
	}
	
	public Award () {
		
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCollectionDate() {
		return this.collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
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
