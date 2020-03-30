package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subjectName;
    private String subjectHours;

    public Subject(String subjectName, String subjectHours) {
        this.subjectName = subjectName;
        this.subjectHours = subjectHours;
    }

    public Subject() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectHours() {
        return subjectHours;
    }

    public void setSubjectHours(String subjectHours) {
        this.subjectHours = subjectHours;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectName=" + subjectName + ", subjectHours=" + subjectHours + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.subjectName);
        hash = 83 * hash + Objects.hashCode(this.subjectHours);
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
        final Subject other = (Subject) obj;
        if (!Objects.equals(this.subjectName, other.subjectName)) {
            return false;
        }
        if (!Objects.equals(this.subjectHours, other.subjectHours)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
