package com.tutorialspoint.CDTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	// @ContextConfiguration 告知需要在CDPlayerConfig中加载配置
	// @Autowired 将CompactDisc bean注入到测试代码中
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNumm() {
		assertNotNull(cd);
	}
}
