import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@Configuration
@ComponentScan(value = "mobile")
@ContextConfiguration(classes = BaseTest.class)
public abstract class BaseTest extends AbstractTestNGSpringContextTests {
}
