package jeff.dev.RegisterAddressCliente.repository;

import jeff.dev.RegisterAddressCliente.entity.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
