
package com.ibm.jsp.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/empservlet", "root", "");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Emp e){
		int status=0;
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into employee(name,password,email,country,department,designation,salary) values (?,?,?,?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			ps.setString(5,e.getDepartment());
			ps.setString(6,e.getDesignation());
			ps.setInt(7, e.getSalary());
			
			
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int update(Emp e){
		int status=0;
		try{
			
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update employee set name=?,password=?,email=?,country=?,department=?,designation=?,salary=? where id=?");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			ps.setString(5, e.getDepartment());
			ps.setString(6, e.getDesignation());
			ps.setInt(7,e.getSalary());
			ps.setInt(8,e.getId());
			status=ps.executeUpdate();
			System.out.println(e);
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		System.out.println("status"+status);
		return status;
	}
	
	public static int delete(int id){
		int status=0;
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static Emp getEmployeeById(int id){
		Emp e=new Emp();
		
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				e.setDepartment(rs.getString(6));
				e.setDesignation(rs.getString(7));
				e.setSalary(rs.getInt(8));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	}
	public static List<Emp> getAllEmployees(){
		System.out.println("get all emp");
		List<Emp> list=new ArrayList<Emp>();
		
		try{
			System.out.println("in try ");
			Connection con=EmpDao.getConnection();
			System.out.println(con+"con");
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				e.setDepartment(rs.getString(6));
				e.setDesignation(rs.getString(7));
				e.setSalary(rs.getInt(8));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
