package hello.proxy.pureproxy.decorater;

import hello.proxy.pureproxy.decorater.code.Component;
import hello.proxy.pureproxy.decorater.code.DecoratorPatternClient;
import hello.proxy.pureproxy.decorater.code.MessageDecorator;
import hello.proxy.pureproxy.decorater.code.RealComponent;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator() {
        RealComponent realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }

    @Test
    void decorator1() {
        RealComponent realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);
        client.execute();

    }

}
