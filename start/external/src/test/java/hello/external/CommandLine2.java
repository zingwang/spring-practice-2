package hello.external;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Properties;
import java.util.Set;


@Slf4j
public class CommandLine2 {

    public static void main(String[] args){

        //--url=devdb --url=devdb2 --username=dev_user --password=dev_pw mode=on
        for(String arg : args){
            log.info("arg {}", arg);
        }
        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("SoruceArgs = {}", List.of(appArgs.getSourceArgs()));
        log.info("NotOoptionArgs= {}",appArgs.getNonOptionArgs());
        log.info("OptionsNames={}", appArgs.getOptionNames());

        Set<String> optionsNames = appArgs.getOptionNames();

        for(String optionName: optionsNames){
            log.info("option arg {}={}", optionName, appArgs.getOptionValues(optionName));
        }

        List<String> url = appArgs.getOptionValues("url");
        List<String> username = appArgs.getOptionValues("username");
        List<String> password = appArgs.getOptionValues("password");
        List<String> mode = appArgs.getOptionValues("mode");

        log.info("url={}",url);
        log.info("username={}",username);
        log.info("password={}",password);
        log.info("mode={}",mode);// -- 가 포함되어 있지 않아서

    }

}
