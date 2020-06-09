package achievem.backend.springboot.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String name;
    
    @NotNull
    private String userName;
    
    @NotNull
    private String registrationDate;
    
    @NotNull
    private String password;
    
    @OneToOne
    @JoinColumn(name = "ranking_id", referencedColumnName = "id", nullable = false)
    private Ranking ranking;
    
    public User(String name, String userName, String registrationDate, String password, Ranking ranking) {
		this.name = name;
		this.userName = userName;
		this.registrationDate = registrationDate;
		this.password = password;
		this.ranking = ranking;
	}
	
	public User() {}
    
    public Long getId() {
        return this.id;
    }

    private void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Ranking getRanking() {
		return ranking;
	}   
}
