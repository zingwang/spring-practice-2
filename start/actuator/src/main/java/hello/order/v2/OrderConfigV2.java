package hello.order.v2;

import hello.order.OrderService;
import hello.order.v2.OrderServiceV2;
import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV2 {

    @Bean
    public OrderService orderService(){
        return new OrderServiceV2();
    }


    // Counted관련 AOP
    @Bean
    public CountedAspect countedAspect(MeterRegistry registry){
        return new CountedAspect(registry);
    }
}
