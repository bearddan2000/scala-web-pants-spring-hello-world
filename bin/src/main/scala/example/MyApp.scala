
import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@EnableAutoConfiguration
class MyApp extends CommandLineRunner {
    override def run(args: String*): Unit = {
        println("Hello world!")
    }
}

object Application extends App {

 SpringApplication.run(classOf[MyApp]);

}