package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String personi;
    private int isikukood;
    
    public Person() {
    }

    public Person(String name, String lastName, String personi, int isikukood) {
        this.name = name;
        this.lastName = lastName;
        this.personi = personi;
        this.isikukood = isikukood;
    }

    public Person(String name, String lastName, String ikukood, Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person(String name, String lastName, Person person, String ikukood) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person(String name, String lastName, String personi, String ikukood) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPerson() {
        return personi;
    }

    public void setPerson(String personi) {
        this.personi = personi;
    }

    public int getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(int isikukood) {
        this.isikukood = isikukood;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", personi=" + personi + ", isikukood=" + isikukood + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.lastName);
        hash = 11 * hash + Objects.hashCode(this.personi);
        hash = 11 * hash + this.isikukood;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.personi, other.personi)) {
            return false;
        }
        if (!Objects.equals(this.isikukood, other.isikukood)) {
            return false;
        }
        return true;
    }
    
    
    
}
