package ProjectPersonal.example.ProjectPersonal.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {


    //declaramos mis atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "comment", nullable = false)
    private String comment;


    //constructor vacio

    public User(){}




    //constructor
    public User(Long id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }





    //getters y setters
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


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }

    
}




    
