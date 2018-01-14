package demo.msa.msahello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MsaHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaHelloApplication.class, args);
	}


	@RequestMapping(method = RequestMethod.GET,path = "/hello")
	public String hello() {
        return "hello world";
	}
}
