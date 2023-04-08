package smart.dai.zeuslearnserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import smart.dai.utils.server.ServerUtil;

import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
public class ZeusLearnServerApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ZeusLearnServerApplication.class, args);
        log.info(ServerUtil.getAppStartNotifyLog(applicationContext, ZeusLearnServerApplication.class));
    }

}
