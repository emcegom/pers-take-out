package org.emcegom.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.emcegom.project.entity.Employee;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
