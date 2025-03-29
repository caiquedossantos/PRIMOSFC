package primos.primos.PrimosRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import primos.primos.PrimosModel.Jogador;

public interface JogadorRepository  extends JpaRepository<Jogador, Long> {
    // JpaRepository já fornece métodos básicos como:
    // - save() -> Salvar um jogador
    // - findById() -> Buscar um jogador por ID
    // - findAll() -> Buscar todos os jogadores
    // - deleteById() -> Deletar um jogador por ID
}
