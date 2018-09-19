package dubbo.rabbitmq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.Scanner;

@SpringBootApplication
@ImportResource({"classpath:dubbo/*.xml","classpath:mq/*.xml"})
@ComponentScan(basePackages = "dubbo.rabbitmq")
public class StartMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String port = scanner.nextLine();
        ConfigurableApplicationContext run = new SpringApplicationBuilder(StartMain.class)
                .properties("server.port=" + port).run(args);

    }
}
