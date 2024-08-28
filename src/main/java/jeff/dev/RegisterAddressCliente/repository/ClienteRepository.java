package jeff.dev.RegisterAddressCliente.repository;

import jeff.dev.RegisterAddressCliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
