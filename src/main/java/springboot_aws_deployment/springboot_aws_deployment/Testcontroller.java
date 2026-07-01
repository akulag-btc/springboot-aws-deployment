package springboot_aws_deployment.springboot_aws_deployment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Testcontroller {

    @GetMapping("/data")
    public String getData() {
        return "First message from AWS ECS";
    }

}
