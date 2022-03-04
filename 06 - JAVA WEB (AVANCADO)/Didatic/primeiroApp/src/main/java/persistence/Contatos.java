package persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.recodepro.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
