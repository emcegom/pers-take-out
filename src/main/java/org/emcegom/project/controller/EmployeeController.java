package org.emcegom.project.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.emcegom.project.common.Result;
import org.emcegom.project.entity.Employee;
import org.emcegom.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/login")
    public Result<Employee> login(HttpServletRequest request, @RequestBody Employee employee) {
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername, employee.getUsername());
        Employee emp = employeeService.getOne(queryWrapper);

        if (null == emp) {
            return Result.error("登陆失败");
        }
        if (!emp.getPassword().equals(password)) {
            return Result.error("密码错误");
        }
        if (emp.getStatus() == 0) {
            return Result.error("账号已被禁用");
        }

        request.getSession().setAttribute("employee", emp.getId());

        return Result.success(emp);
    }


    @PostMapping("/logout")
    public Result<String> logout(HttpServletRequest request) {
        request.removeAttribute("employee");
        return Result.success("退出成功");
    }


    @PostMapping("")
    public Result<String> save(HttpServletRequest request, @RequestBody Employee employee) {
        log.info("新增员工，员工信息 {}", employee);

        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        employee.setCreateTime(LocalDateTime.now());
        employee.setUpdateTime(LocalDateTime.now());

        Long empId = (Long) request.getSession().getAttribute("employee");

        employee.setCreateUser(empId);
        employee.setUpdateUser(empId);

        employeeService.save(employee);

        return Result.success(null);
    }

    @GetMapping("/page")
    public Result<Page> page(int page, int pageSize, String name) {
        log.info("page={}, pageSize={}, name={}", page, pageSize, name);

        Page pageInfo = new Page<>(page, pageSize);

        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.like(StringUtils.hasLength(name), Employee::getName, name)
            .orderByDesc(Employee::getUpdateTime);

        employeeService.page(pageInfo, queryWrapper);

        return Result.success(pageInfo);
    }

    @PutMapping
    public Result<String> update(HttpServletRequest request, @RequestBody Employee employee) {
        log.info(employee.toString());

        Long empId = (Long) request.getSession().getAttribute("employee");

        employee.setUpdateTime(LocalDateTime.now());
        employee.setUpdateUser(empId);

        return employeeService.updateById(employee) ? Result.success("修改成功") : Result.error("修改失败");
    }

    @GetMapping("/{id}")
    public Result<Employee> getById(@PathVariable String id) {
        log.info("根据id查对象");
        Employee emp = employeeService.getById(id);
        if (emp != null) {
            return Result.success(emp);
        }
        return Result.error("未查询到该用户");
    }


}
