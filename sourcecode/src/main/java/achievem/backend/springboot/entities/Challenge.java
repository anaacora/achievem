package achievem.backend.springboot.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Challenge  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String hashtag;

	@NotNull
	private Date startDate;

	private Date endDate;

	@ManyToOne
	@JoinColumn(name = "award_id", referencedColumnName = "id", nullable = false)
	private Award award;
	
	@ManyToMany (mappedBy = "challenges")
	private Set<Friendship> challenges;
	
	public Challenge(String hashtag, Date startDate, Date endDate, Award award) {
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

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getId() {
		return this.id;
	}

	private void setId(long id) {
		this.id = id;
	}

	public Award getAward() {
		return this.award;
	}
}
