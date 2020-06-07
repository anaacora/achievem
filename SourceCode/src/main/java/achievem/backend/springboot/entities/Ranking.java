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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Ranking implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private int level;
	
	@NotNull
	private int totalScore;
	
	@NotNull
	private String stage;
	
	public Ranking(int level, int totalScore, String stage) {
		this.level = level;
		this.totalScore = totalScore;
		this.stage = stage;

	}
	
	public Ranking() {}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

}
