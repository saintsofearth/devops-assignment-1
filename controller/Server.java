import java.*;

@SpringBootApplication
@EnableAsync
@EnableScheduling
@EnableRetry

public class Server {

	public static void main(String args[]) {

		SpringApplication.run(Server.class, args);
	}

}
