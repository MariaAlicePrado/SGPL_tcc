package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Usuario;
import sgpl.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService  {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario inserir(Usuario usuario) {

        return null;
    }

    @Override
    public Usuario salvar(Usuario ocorrencia) {
        return null;
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(long id) {
        return usuarioRepository.findById(id).get();
    }
}
