package entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "livre")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long code;
    private String titre;
    private String auteur;
    private int nb_exemplaire;

    public Book(String titre, String auteur, int nb_exemplaire) {
        this.titre = titre;
        this.auteur = auteur;
        this.nb_exemplaire = nb_exemplaire;
    }
}
