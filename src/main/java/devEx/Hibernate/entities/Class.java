package devEx.Hibernate.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "classes")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column (nullable = false)
    private String description;

    @ManyToMany (mappedBy = "classesList")
    private Set<Student> studentsList;

    public Class(){}

    public Class(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(Set<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
