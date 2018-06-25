package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")

	public String value() {
		String hostname =null;
		try {
			InetAddress addr = java.net.InetAddress.getLocalHost();
			System.out.println(addr);
			hostname = addr.getHostName();
			System.out.println("Hostname of system = " + hostname);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
		return "Hello from Java Example 1: "+ hostname;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		try {
			System.out.println("Hello from Java Example 1, hostname: " + InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e){
			System.out.println(e);
		}
	}
}