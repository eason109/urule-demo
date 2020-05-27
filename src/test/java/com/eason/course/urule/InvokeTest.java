package com.eason.course.urule;


import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.eason.course.vo.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:/spring-context.xml"})
@WebAppConfiguration
public class InvokeTest {

    @Test
    public void testInvoke() throws IOException {
        Assert.assertTrue(true);
        Object o = Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);

        KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("demo/customer-test");
        KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

        Customer customer = new Customer();
        customer.setAge(28);
        customer.setName("Eason");
        customer.setPhone("15802016189");

        session.insert(customer);
        session.fireRules();
    }
}
