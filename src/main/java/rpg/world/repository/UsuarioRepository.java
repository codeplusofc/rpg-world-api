package rpg.world.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rpg.world.model.Usuario;

//CONTRATO COM O BANCO DE DADOS
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
