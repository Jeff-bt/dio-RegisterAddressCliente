package jeff.dev.RegisterAddressCliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class RegisterAddressClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterAddressClienteApplication.class, args);
	}

}
