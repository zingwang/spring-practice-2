package hello.order.v1;

import hello.order.OrderService;
import io.micrometer.core.instrument.MeterRegistry;
import io.prometheus.client.Counter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class OrderServiceV1 implements OrderService {

    private AtomicInteger stock = new AtomicInteger(100);
    private final MeterRegistry registry;
    public OrderServiceV1(MeterRegistry registry ){
        this.registry = registry;
    }
    @Override
    public void order() {
        log.info("주문");
        stock.decrementAndGet();


    }

    @Override
    public void cancel() {
        log.info("취소");
        stock.incrementAndGet();
    }

    @Override
    public AtomicInteger getStock() {
        return stock;
    }
}
