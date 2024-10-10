package sgpl.services;

import sgpl.model.Usuario;
import java.util.List;

public interface UsuarioService {

    public Usuario inserir(Usuario usuario);
    public Usuario salvar(Usuario ocorrencia);


    List<Usuario> findAll();

    Usuario findById(long id);
}
