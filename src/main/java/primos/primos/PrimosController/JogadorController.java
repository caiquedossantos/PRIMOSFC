package primos.primos.PrimosController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import primos.primos.PrimosService.JogadorService;
import primos.primos.PrimosModel.Jogador;  // Certifique-se de importar corretamente!


import java.util.List;


@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping

    public List<Jogador> listarTodos() {
        return jogadorService.listarTodos();
    }
}
