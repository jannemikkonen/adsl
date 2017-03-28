package fi.puv.e1401140.router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableJpaRepositories ("fi.puv.e1401150.router.repository")
//@ComponentScan("fi.puv.e1401150.router.controller")
@SpringBootApplication
public class Application {
	
	/* sovellus k�ynnistet��n t�st� aplikaationa. sovellus k�ytt�� tomcat-palvelimen oletuksena portin 8080 (localhost).
	
	ajat sovellusta selaimella http://localhost:8080/test
	
	kun sovelluksen k�ynnist��, se etsii luokkia, jossa on annonaatio
	on @RestController joissa metodin annonaatio on  @RequestMapping
	*/
	
	//
	
	/* private static final Logger log = LoggerFactory.getLogger(Application.class);
*/
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}	
	
	
}
