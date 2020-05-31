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
public class Challenge  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String hashtag;

	@NotNull
	private String startDate;

	@NotNull
	private String endDate;

	@ManyToOne
	@JoinColumn(name = "award_id", referencedColumnName = "id", nullable = false)
	private Award award;
	
	@ManyToMany (mappedBy = "challenges")
	private Set<Friendship> challenges;

	
	public Challenge(String hashtag, String startDate, String endDate, Award award) {
		this.hashtag = hashtag;
		this.startDate = startDate;
		this.endDate = endDate;
		this.award = award; 
	}
	
	public Challenge() {}
	
	public String getHashtag() {
		return this.hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public Award getAward() {
		return this.award;
	}
	
	
	
}
