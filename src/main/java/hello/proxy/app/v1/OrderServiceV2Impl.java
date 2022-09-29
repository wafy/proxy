package hello.proxy.app.v1;

public class OrderServiceV2Impl implements OrderServiceV2 {

    private final OrderRepositoryV1 orderRepositoryV1;

    public OrderServiceV2Impl(OrderRepositoryV1 orderRepository) {
        this.orderRepositoryV1 = orderRepository;
    }

    @Override
    public void orderItem(String itemId) {
        orderRepositoryV1.save(itemId);
    }
}
