package com.nt.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.EmpDao.EmpDao;
import com.nt.Entity.Employee;

@Controller
public class EmpController {
	

	
		// write a method which will get call when user submit the form

		@Autowired
		private EmpDao dao;

		@RequestMapping("/")
		public String indexPage() {
			return "index";
		}
		
		

		// for getting form
		@RequestMapping("/registerPage")
		public String registerPage() { // job of this method is to return register.jsp
			return "register";
		}
}

		// for processing form
//		@RequestMapping(value = "/register", method = RequestMethod.POST)
//		public String register(@ModelAttribute Employee e, Model model) {
//
//			boolean isAdded = dao.register(e);
//			if (isAdded) {
//				model.addAttribute("message", "Registration successful");
//
//			} else {
//				model.addAttribute("message", "Unable to Register");
//
//			}
//			return "result";
//
//		}
//		
//		
//
//		@RequestMapping("/UpdatePage")
//		public String UpdatePage() { // job of this method is to return update.jsp
//			return "update";
//		}
//
//		@RequestMapping("/update")
//		public String updateSalary(@RequestParam int id, @RequestParam int sal, Model model) {
//
//			boolean isUpdated = dao.updateSalary(id, sal);
//
//			if (isUpdated) {
//				model.addAttribute("message", "Updation successful");
//
//			} else {
//				model.addAttribute("message", "Unable to Update");
//
//			}
//			return "result";
//		}
//		
//		
//
//		@RequestMapping("/selectPage")
//		public String selectPage() { // job of this method is to return update.jsp
//			return "select";
//		}
//
//		@RequestMapping("/select")
//		public String selectRecord(@RequestParam int id, Model model) {
//
//			Employee e = dao.select(id);
//
//			if (e == null) {
//
//				model.addAttribute("message", "NO Record found");
//
//				return "result";
//			}
//			model.addAttribute("emp", e);
//			return "display";
//
//		}
//		
//		
//
//		@RequestMapping("/deletePage")
//		public String deletePage() { // job of this method is to return delete.jsp
//			return "delete";
//		}
//
//		@RequestMapping("/delete")
//		public String deleteRecord(@RequestParam int id, Model model) {
//
//			boolean deleted = dao.deleteRecord(id);
//
//			if (deleted == true) {
//
//				model.addAttribute("message", "Record Deleted Successfully");
//			} else
//				model.addAttribute("message", "Record Not Found");
//
//			return "result";
//
//		}
//		
//		
//
//		@RequestMapping("/all")
//		public String allRecords(Model model) {
//
//			List<Employee> list = dao.selectAll();
//
//			model.addAttribute("emplist", list);
//			return "displayAll";
//		}
//		
//		
//
//		@RequestMapping("/loginPage")
//		public String loginPage() { // job of this method is to return delete.jsp
//			return "login";
//		}
//
//		@RequestMapping(value = "/login", method = RequestMethod.POST)
//		public String login(@RequestParam String username, @RequestParam String password, Model model) {
//			model.addAttribute("message", "Login successful");
//
//			return "result";
//		}
//	}
//



	/*
	 * @RequestMapping("/register") // this method get call when user enters /test
	 * in the url public String register(@RequestParam("id") int i, @RequestParam
	 * String name, @RequestParam int sal) { Employee e = new Employee(i, name,
	 * sal); dao.register(e);
	 * 
	 * return "result"; // result is jsp File name }
	 */

	/*
	 * System.out.println(i +" "+name+" "+sal);
	 * 
	 * try { Class.forName("com.mysql.jdbc"); Connection con =
	 * DriverManager.getConnection(""); PreparedStatement ps
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 */