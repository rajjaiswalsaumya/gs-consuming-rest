package hello;

/**
 * Developer       :  Rohit Gupta
 * File created on :  20-06-2015 at 03:07.
 * Description : ${DESC}
 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


/**
 * Developer       :  Rohit Gupta
 * File created on :  20-06-2015 at 03:08.
 * Description : This is simple Boot Application Runner Class
 */

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> s
                = restTemplate.getForEntity("http://services.groupkt.com/country/get/iso2code/IN", String.class);
        System.out.println(s);
    }


}



