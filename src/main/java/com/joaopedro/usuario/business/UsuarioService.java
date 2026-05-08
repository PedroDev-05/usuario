package com.joaopedro.usuario.business;

import com.joaopedro.usuario.business.converter.UsuarioConverter;
import com.joaopedro.usuario.business.dto.UsuarioDTO;
import com.joaopedro.usuario.infrastructure.entity.Usuario;
import com.joaopedro.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private UsuarioConverter usuarioConverter;
    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
