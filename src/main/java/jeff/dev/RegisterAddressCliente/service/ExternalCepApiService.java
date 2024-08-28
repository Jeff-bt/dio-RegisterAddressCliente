package jeff.dev.RegisterAddressCliente.service;

import jeff.dev.RegisterAddressCliente.entity.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "viacep", url = "viacep.com.br/ws")
public interface ExternalCepApiService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
