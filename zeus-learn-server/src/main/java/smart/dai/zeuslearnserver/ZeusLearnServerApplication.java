package smart.dai.zeuslearnserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import smart.dai.utils.FeishuUtil;

import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
@ComponentScans({@ComponentScan(value = "smart.dai")})
public class ZeusLearnServerApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ZeusLearnServerApplication.class, args);
        FeishuUtil.appStartNotify(applicationContext, ZeusLearnServerApplication.class);
    }

}
