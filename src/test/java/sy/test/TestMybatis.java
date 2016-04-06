package sy.test;

import java.util.List;

import org.apache.log4j.Logger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import sy.model.SysUser;
import sy.serviceimpl.SysUserServiceImpl;

//spring-test与junit4结合的测试

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestMybatis {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(TestMybatis.class);
	
	private SysUserServiceImpl sysUserServiceImpl;
	
		@Test
		public void test1(){
			
			SysUser user = sysUserServiceImpl.getUserById(2);
			//System.out.println(user.getUname());
			logger.info(user+"??????????????????????????????????????");
			logger.info(JSON.toJSONString(user));
			logger.info(JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd HH:mm:ss"));
		}

		public SysUserServiceImpl getSysUserServiceImpl() {
			return sysUserServiceImpl;
		}
		@Autowired
		public void setSysUserServiceImpl(SysUserServiceImpl sysUserServiceImpl) {
			this.sysUserServiceImpl = sysUserServiceImpl;
		}	
		@Test
		public void test2(){
			
			List<SysUser> allUser = sysUserServiceImpl.getAll();
			logger.info(JSON.toJSONStringWithDateFormat(allUser,"yyyy-MM-dd")+"??????????????????????????????????????????????");
		}
}



//原来的junit测试
/*public class TestMybatis {
	private ApplicationContext ac;
	private SysUserServiceImpl sysUserServiceImpl;
	
		@Before
		public void before(){
			 ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
			 sysUserServiceImpl=(SysUserServiceImpl) ac.getBean("sysUserService");
		}
	
		@Test
		public void test1(){
			
			SysUser user = sysUserServiceImpl.getUserById(5);
			System.out.println(user.getUname());
		}	
}*/













