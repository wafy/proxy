package hello.proxy.app.v1;

public class OrderControllerV1Impl implements OrderControllerV1 {

    private final OrderServiceV2 orderService;

    public OrderControllerV1Impl(OrderServiceV2 orderService) {
        this.orderService = orderService;
    }

    @Override
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "OK";
    }

    @Override
    public String noLog() {
        return "OK";
    }
}
