package maven_example_ssm.simple.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import maven_example_ssm.simple.dao.DepartmentMapper;

 /**
 * ����dao�㹤��
 * @author xinxin
 *ֱ��ʹ��spring�ĵ�Ԫ���� �������Զ�ע�����ǵ���Ҫ�����
 *����spring testģ�� pom ���
 *@ContextConfiguration ָ�� sping�����ļ�����
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class MapperTest {
	 /**
	  * ����deparmentmapper
	  */
	@Autowired
	DepartmentMapper departmentMapper ;
	
 	@Test
	 public void test(){
	//ԭ����	 
		 //1 ����springioc ����
//		 ApplicationContext  ioc   = new ClassPathXmlApplicationContext("applicationContext.xml");
		 //2 �������л�ȡmapper �õ�dao
//		 DepartmentMapper dept =ioc.getBean(DepartmentMapper.class);
		 System.out.println(departmentMapper);
		 
	 }
}
