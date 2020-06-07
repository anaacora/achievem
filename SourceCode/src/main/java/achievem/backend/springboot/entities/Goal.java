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
public class Goal implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String name;

	@NotNull
	private String category;

	@NotNull
	private String target;
	
	private String progress;

	private String unit;

	@NotNull
	private String startDate;
	
	private String endDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "award_id", referencedColumnName = "id", nullable = false)
	private Award award;
	
	public Goal(String name, String category, String target, String progress, String unit, String startDate, String endDate, User user, Award award) {
		this.name = name;
		this.category = category;
		this.target = target;
		this.progress = progress;
		this.unit = unit ;
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
		this.award = award;
	}
	
	public Goal() {}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getProgress() {
		return this.progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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

	public User getUser() {
		return this.user;
	}

	public Award getAward() {
		return this.award;
	}



}
