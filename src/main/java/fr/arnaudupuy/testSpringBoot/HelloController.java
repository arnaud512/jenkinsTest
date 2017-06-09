package fr.arnaudupuy.testSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arnaud on 08/06/2017.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello spring world!";
    }

}
