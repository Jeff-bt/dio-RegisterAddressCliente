package jeff.dev.RegisterAddressCliente.service;

import jeff.dev.RegisterAddressCliente.entity.Cliente;
import jeff.dev.RegisterAddressCliente.entity.DTOs.ClienteDTO;
import jeff.dev.RegisterAddressCliente.entity.Endereco;
import jeff.dev.RegisterAddressCliente.repository.ClienteRepository;
import jeff.dev.RegisterAddressCliente.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;
    private final ExternalCepApiService cepApiService;

    public ClienteService(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository, ExternalCepApiService cepApiService) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.cepApiService = cepApiService;
    }

    public Cliente save(ClienteDTO body) {
        String cep = body.cep();
        Endereco endereco = enderecoRepository.findById(Long.valueOf(cep)).orElseGet(() -> {
                    try {
                        Endereco newEndereco = cepApiService.consultarCep(cep);
                        return enderecoRepository.save(newEndereco);
                    } catch (Exception e) {
                        throw new RuntimeException("Cep inválido");
                    }
        });

        Cliente cliente = ClienteDTO.ToCliente(body);
        cliente.setEndereco(endereco);

        return clienteRepository.save(cliente);
    }
}
