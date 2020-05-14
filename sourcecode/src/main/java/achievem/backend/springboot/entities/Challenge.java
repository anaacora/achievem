package achievem.backend.springboot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Challenge  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String hashtag;

	@NotNull
	private String startDate;

	@NotNull
	private String endDate;

	@ManyToMany(mappedBy = "challenges")
	private Set<Friendship> friendships;
	
	@ManyToOne
	private Award award;

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Award getAward() {
		return award;
	}
	
	
}
