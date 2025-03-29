package primos.primos.PrimosModel;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity // Indica que esta classe é uma entidade JPA e será mapeada para uma tabela no banco de dados.
@Table(name = "jogadores") // Define o nome da tabela no banco de dados como "jogadores".

@Getter // Gera automaticamente os métodos "get" para todos os atributos da classe.
@Setter // Gera automaticamente os métodos "set" para todos os atributos da classe.
@NoArgsConstructor // Cria um construtor vazio (necessário para o JPA funcionar corretamente).
@AllArgsConstructor // Cria um construtor com todos os atributos como parâmetros.
@ToString // Gera automaticamente o método "toString()" para facilitar a exibição dos dados.


public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String posicao;

    @Column(nullable = false)
    private LocalDate dataNasc;


}
