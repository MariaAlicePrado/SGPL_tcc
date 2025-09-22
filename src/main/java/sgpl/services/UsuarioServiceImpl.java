package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Usuario;
import sgpl.repository.UsuarioRepository;

import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService  {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public Usuario salvar(Usuario ocorrencia) {
        return null;
    }

    public Usuario create(Usuario usuario) {
        String senha = Base64.getEncoder().encodeToString(usuario.getSenha().getBytes());

        usuario.setSenha(senha);
        usuario.setDataCadastro(new Date());
        return usuarioRepository.save(usuario);
    }
    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario findByRm(String rm) {
        return this.usuarioRepository.findByRm(rm);
    }

    @Override
    public Usuario alterarUsuario(Long id, Usuario usuario){
        Optional<Usuario> _usuario =  usuarioRepository.findById(id);

        if(_usuario.isPresent()){
            Usuario usuarioid = _usuario.get();

            usuarioid.setNome(usuario.getNome());
            usuarioid.setEmail(usuario.getEmail());

            return usuarioRepository.save(usuarioid);
        }

        return null;
    }

    @Override
    public Usuario inativar(Long id){
        Optional<Usuario> _usuario =  usuarioRepository.findById(id);

        if(_usuario.isPresent()){
            Usuario usuarioid = _usuario.get();

            usuarioid.setStatusUsuario("INATIVO");

            return usuarioRepository.save(usuarioid);
        }

        return null;
    }

    @Override
    public Usuario reativar(Long id){
        Optional<Usuario> _usuario =  usuarioRepository.findById(id);

        if(_usuario.isPresent()){
            Usuario usuarioid = _usuario.get();

            usuarioid.setStatusUsuario("ATIVO");

            return usuarioRepository.save(usuarioid);
        }

        return null;
    }

    @Override
    public Usuario signin(String rm, String senha) {
        Usuario usuario = usuarioRepository.findByRm(rm);
        System.out.println(usuario);
        if(usuario != null) {
            if (!usuario.getStatusUsuario().equals("INATIVO")) {
                byte[] decodedPass = Base64.getDecoder()
                        .decode(usuario.getSenha());
                if (new String(decodedPass).equals(senha)) {
                    return usuario;
                }
            }
        }
        return null;
    }
}
