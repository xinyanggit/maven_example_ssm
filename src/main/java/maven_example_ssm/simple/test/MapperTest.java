package maven_example_ssm.simple.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import maven_example_ssm.simple.dao.DepartmentMapper;

 /**
 * 测试dao层工作
 * @author xinxin
 *直接使用spring的单元测试 ，可以自动注入我们的需要的组件
 *导入spring test模块 pom 添加
 *@ContextConfiguration 指定 sping配置文件属性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class MapperTest {
	 /**
	  * 测试deparmentmapper
	  */
	@Autowired
	DepartmentMapper departmentMapper ;
	
 	@Test
	 public void test(){
	//原生的	 
		 //1 创建springioc 容器
//		 ApplicationContext  ioc   = new ClassPathXmlApplicationContext("applicationContext.xml");
		 //2 从容器中获取mapper 得到dao
//		 DepartmentMapper dept =ioc.getBean(DepartmentMapper.class);
		 System.out.println(departmentMapper);
		 
	 }
}
