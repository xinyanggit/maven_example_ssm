package maven_example_ssm.simple.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import maven_example_ssm.simple.bean.Emplovee;
import maven_example_ssm.simple.bean.EmploveeExample;

public interface EmploveeMapper {
    long countByExample(EmploveeExample example);

    int deleteByExample(EmploveeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Emplovee record);

    int insertSelective(Emplovee record);

    List<Emplovee> selectByExampleWithDept(EmploveeExample example);

    Emplovee selectByPrimaryKeyWithDept(Integer empId);
    
    List<Emplovee> selectByExample(EmploveeExample example);

    Emplovee selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") Emplovee record, @Param("example") EmploveeExample example);

    int updateByExample(@Param("record") Emplovee record, @Param("example") EmploveeExample example);

    int updateByPrimaryKeySelective(Emplovee record);

    int updateByPrimaryKey(Emplovee record);
}