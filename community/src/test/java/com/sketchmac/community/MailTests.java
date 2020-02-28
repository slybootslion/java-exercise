package com.sketchmac.community;

import com.sketchmac.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("slybootslion@vip.qq.com", "欢迎Java论坛", "欢迎！这是一段文本的内容");
    }

    @Test
    public void testHtmlMail() {
        Context context = new Context();
        context.setVariable("username", "slybootslion");

        String content = templateEngine.process("/mail/demo", context);

        mailClient.sendMail("slybootslion@vip.qq.com", "欢迎Java论坛，Html模板类", content);
    }
}
