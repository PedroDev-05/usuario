package com.joaopedro.usuario.infrastructure.repository;


import com.joaopedro.usuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Usuario, Long> {
}
