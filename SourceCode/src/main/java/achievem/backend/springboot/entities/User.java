package achievem.backend.springboot.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String name;
    
    @NotNull
    private String userName;
    
    @NotNull
    private String registrationDate;
    
    @NotNull
    private String password;
    
    @OneToOne
    @JoinColumn(name = "rank_id", referencedColumnName = "id")
    private Rank rank;
    
    public User(String name, String userName, String registrationDate, String password, Rank rank) {
		this.name = name;
		this.userName = userName;
		this.registrationDate = registrationDate;
		this.password = password;
		this.rank = rank;

	}
	
	public User() {}
    
    public int getId() {
        return id;
    }

    private void setId(int id) {
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

	public Rank getRank() {
		return rank;
	}
	
    
    
}
