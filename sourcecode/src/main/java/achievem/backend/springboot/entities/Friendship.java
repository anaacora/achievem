package achievem.backend.springboot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Friendship implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	private User userOne;

	@NotNull
	private User userTwo;

	@NotNull
	private String startDate;

	private String endDate;

	@NotNull
	private String status;
	
	@NotNull
	private String friendshipDate;

	@ManyToMany
	@JoinTable(name = "friendship_challenge", joinColumns = @JoinColumn(name = "friendship_id"), inverseJoinColumns = @JoinColumn(name = "challenge_id"))
	private Set<Challenge> challenges;

	public int getId() {
		return id;
	}

	private void setId(int id) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFriendshipDate() {
		return friendshipDate;
	}

	public void setFriendshipDate(String friendshipDate) {
		this.friendshipDate = friendshipDate;
	}
	
	
}
