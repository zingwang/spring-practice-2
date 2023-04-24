package hello;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Properties;


@Slf4j
@Component
public class EnvironmentCheck {
    private final Environment env;

    public EnvironmentCheck(Environment env){
        this.env=env;
    }

    @PostConstruct
    public void init(){
        String url = env.getProperty("url");
        String username = env.getProperty("username");
        String userpassword = env.getProperty("userpassword");

        log.info("env url={}",url);
        log.info("env username={}",username);
        log.info("env password={}",password);
    }

}
