package achievem.backend.springboot.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;

@Entity
public class Friendship implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_one", referencedColumnName = "id", nullable = false)
	private User userOne;

	@ManyToOne
	@JoinColumn(name = "user_two", referencedColumnName = "id", nullable = false)
	private User userTwo;

	@NotNull
	private Date startDate;

	private Date endDate;

	@NotNull
	private String status;

	@ManyToMany
	@JoinTable(name = "friendship_challenge", joinColumns = @JoinColumn(name = "friendship_id"), inverseJoinColumns = @JoinColumn(name = "challenge_id"))
	private Set<Challenge> challenges;

	public Friendship(User userOne, User userTwo, Date startDate, Date endDate, String status) {
		this.userOne = userOne;
		this.userTwo = userTwo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;		
	}
	
	public Friendship() {
		
	}
	
	public Long getId() {
		return this.id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public User getUserOne() {
		return userOne;
	}

	public void setUserOne(User userOne) {
		this.userOne = userOne;
	}

	public User getUserTwo() {
		return userTwo;
	}

	public void setUserTwo(User userTwo) {
		this.userTwo = userTwo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
