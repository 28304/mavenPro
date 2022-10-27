import com.exer.proxy.Calculator;
import com.exer.proxy.CalculatorImpl;
import com.exer.proxy.CalculatorStaticProxy;
import com.exer.proxy.ProxyFactory;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void test1(){
        CalculatorStaticProxy staticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        int add = staticProxy.add(1, 1);
        System.out.println(add);
    }
    @Test
    public void test2(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        int add = proxy.add(1, 1);
        System.out.println(add);
    }
}
