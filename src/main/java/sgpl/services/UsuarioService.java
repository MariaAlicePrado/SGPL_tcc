package sgpl.services;

import sgpl.model.Usuario;
import java.util.List;

public interface UsuarioService {

    public Usuario create(Usuario usuario);
    public Usuario salvar(Usuario ocorrencia);


    List<Usuario> findAll();

    Usuario findById(long id);

    Usuario findByRm(String rm);

    Usuario alterarUsuario(Long id, Usuario usuario);

    Usuario inativar(Long id);

    Usuario reativar(Long id);

    Usuario signin(String rm, String senha);
}
