package com.nt.EmpDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nt.Entity.Employee;

@Component
public class EmpDao {
}


//	@Autowired
//	private JdbcTemplate template;

//	public Employee select(int id) {

//		try {
//			Object[] args = { id };
//			Employee e1 = template.queryForObject("select * from employee where id=?", args, new EmployeeMapper());
//
//			return e1; // return from select method
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//	// we have to create object of template with xml or annotation.
//	// take that object and store in template variable.
//
//	public boolean register(Employee e) {
//
//		try {
//			Object[] args = { e.getId(), e.getName(), e.getSal() };
//
//			template.update("insert into employee values(?,?,?)", args);
//			return true;
//
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//
//		// System.out.println("Record added in the DataBase");
//		return false;
//
//	}
//
//	public boolean updateSalary(int id, int sal) {
//		try {
//			Object[] args = { sal, id };
//
//			int result = template.update("update employee set sal=? where id=? ", args);
//			if (result == 1)
//				return true;
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//
//		return false;
//
//	}
//
//	public boolean deleteRecord(int id) {
//		try {
//			Object[] args = { id };
//			int deletedRecorcd = template.update("delete from employee where id=? ", args);
//
//			if (deletedRecorcd == 1) {
//				return true;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//	public List<Employee> selectAll() {
//		try {
//
//			List<Employee> list = template.query("select * from employee", new EmployeeMapper());
//			return list;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

