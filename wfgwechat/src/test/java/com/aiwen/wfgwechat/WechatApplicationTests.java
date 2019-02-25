package com.aiwen.wfgwechat;

import com.aiwen.wfgwechat.service.PublicApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class WechatApplicationTests {

	@Autowired
	private PublicApiService service;


	@Test
	public void contextLoads() {
        /*PublicApi api = new PublicApi();
        api.setAppId("wx538469ef6d72aed8");
        api.setAppSecret("108414090d38cbf243ff955fd4fb28cc");
        api.setImg("D:/娱乐/iphone");
        api.setConten("我是通知内容，我是通知内容");
        api.setOpenId("用户的唯一标识");
        api.setTitle("星期二，今天冷");*/
       // List<RequestField> all = service.findAll();
        //System.out.println(all);

    }

}
