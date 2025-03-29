package primos.primos.PrimosService;

import org.springframework.stereotype.Service;
import primos.primos.PrimosModel.Jogador;
import primos.primos.PrimosRepository.JogadorRepository;
import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {

    private final JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public  List<Jogador> listarTodos(){
        return  jogadorRepository.findAll();

    }

    public Optional<Jogador> buscarPorId(Long id){
        return jogadorRepository.findById(id);
    }



}
