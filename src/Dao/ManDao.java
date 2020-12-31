package Dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dButil.SqlHelper;
import Entity.*;

public class ManDao {
	public static List<Man> allMans() {
		List<Man> manList = new ArrayList<Man>();
		String sql = "select * from man";
        ResultSet rs = SqlHelper.executeQuery(sql);
        try {
        	while(rs.next()) {
        		Man man = new Man();
        		man.setId(rs.getString(1));
        		man.setName(rs.getString(2));
        		man.setPwd(rs.getString(3));
        		manList.add(man);
        	}
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return manList;
	}
	
	public static List<Man> selectManById(String id) {
		List<Man> manList = new ArrayList<Man>();
		String sql = "select * from man where mid = '" + id + "' ";
        ResultSet rs = SqlHelper.executeQuery(sql);
        try {
        	while(rs.next()) {
        		Man man = new Man();
        		man.setId(rs.getString(1));
        		man.setName(rs.getString(2));
        		man.setPwd(rs.getString(3));
        		manList.add(man);
        	}
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return manList;
	}
	
	public static int changePwd(String password,String userid) {
		String sql="update man set mpwd='"+password+"' where mid='"+userid+"'";
		return SqlHelper.executeUpdate(sql);
	}
	
	public static List<User> allUsers() {
		List<User> userList = new ArrayList<User>();
		String sql = "select * from user";
        ResultSet rs = SqlHelper.executeQuery(sql);
        try {
        	while(rs.next()) {
        		User user = new User();
        		user.setId(rs.getString(1));
        		user.setName(rs.getString(2));
        		user.setPwd(rs.getString(3));
        		userList.add(user);
        	}
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return userList;
	}
	
	public static List<Diary> allDiaries() {
		List<Diary> diaryList = new ArrayList<Diary>();
		String sql = "select * from Diary";
        ResultSet resultSet = SqlHelper.executeQuery(sql);
        try {
        	while (resultSet.next()) {
        		Diary diary = new Diary();
        		diary.setId(resultSet.getString(1));
        		diary.setIp(resultSet.getString(2));
        		diary.setTime(resultSet.getDate(3));
        		diaryList.add(diary);
        	}
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return diaryList;
	}
	
	public static List<FindPwd> allFindPwds() {
		List<FindPwd> findpwdList = new ArrayList<FindPwd>();
		String sql = "select * from findpwd";
        ResultSet rs = SqlHelper.executeQuery(sql);
        try {
        	while(rs.next()) {
        		FindPwd findpwd = new FindPwd();
        		findpwd.setUserid(rs.getString(1));
        		findpwd.setUserphone(rs.getString(2));
        		findpwd.setUseremail(rs.getString(3));
        		findpwdList.add(findpwd);
        	}
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return findpwdList;
	}
	
	public static List<Car> allCars() {
		List<Car> carList = new ArrayList<Car>();
		String sql = "select * from car";
        ResultSet rs = SqlHelper.executeQuery(sql);
        try {
        	while(rs.next()) {
        		Car car = new Car();
        		car.setId(rs.getString(1));
        		car.setName(rs.getString(2));
        		car.setPrice(rs.getString(3));
        		car.setCount(rs.getString(4));
        		car.setStatus(rs.getString(5));
        		carList.add(car);
        	}
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return carList;
	}
	
	public static int addcar(String cid,String cname,String cprice,String ccount,String cstatus) {
		String sql="insert into car values('"+cid+"','"+cname+"','"+cprice+"','"+ccount+"','"+cstatus+"')";
		return SqlHelper.executeUpdate(sql);
	}
	
	public static int delcar(String cid) {
		String sql="delete from car where cid = '"+cid+"'";
		return SqlHelper.executeUpdate(sql);
	}
	
	public static int editcar(String cid,String cname,String cprice,String ccount,String cstatus) {
		String sql="update car set cname = '"+cname+"' , cprice  = '"+cprice+"' , ccount = '"+ccount+"' , cstatus = '"+cstatus+"' where cid = '"+cid+"'";
		return SqlHelper.executeUpdate(sql);
	}
}