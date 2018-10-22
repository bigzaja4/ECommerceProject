package com.example.Ecommerse;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcommerseApplicationTests {
                @Autowired
                UserRepository userRepository;
    
                @Test
               public void testMessage(){
                    Assert.assertEquals("Hello Software Process", userRepository.findById(1l).get().getMessage());           
               }
    
	@Test
	public void contextLoads() {
	}

}
