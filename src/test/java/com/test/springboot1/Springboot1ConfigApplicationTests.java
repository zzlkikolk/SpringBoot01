package com.test.springboot1;

import com.test.springboot1.Bean.Dog;
import com.test.springboot1.Bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot1ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext IOC;

    @Test
    public void TestIOC(){
        boolean b=IOC.containsBean("dog2");
        boolean c=IOC.containsBean("helloService");
        System.out.println("\n让我们来看下打印的结果"+b+c+"\n");
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
