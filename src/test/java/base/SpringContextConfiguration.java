package base;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//Where @ComponentScan exists is the base package
@ComponentScan({"base","utilities"})
@EnableAspectJAutoProxy
public class SpringContextConfiguration {
}
