package valeriafarinosi.U5_W2_D3.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Entity
@Table(name = "authors")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogAuthor {

    @Id
    @GeneratedValue
    private int authorId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private LocalDate birthDate;
    @Column(nullable = false)
    private String avatarURL;

    public BlogAuthor(String name, String surname, String email, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        Random random = new Random();
        this.authorId = random.nextInt(1, 10000);
        this.avatarURL = "https://ui-avatars.com/api/?name=Mario+Rossi";
    }
}
