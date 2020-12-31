package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Dao.*;
import Entity.*;

@WebServlet("/edit_rs")
public class EditServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");//指定浏览器及utf-8码表打开服务器发出的数据
		response.setCharacterEncoding("utf-8");//设置response使用的码表,控制response以utf-8码表向浏览器写入数据
		request.setCharacterEncoding("utf-8");//同理request
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String cid=(String)session.getAttribute("cid");
		String cname=request.getParameter("cname");
		String cprice=request.getParameter("cprice");
		String ccount=request.getParameter("ccount");
		String cstatus=request.getParameter("cstatus");
		System.out.println(cid+cname+cprice+ccount+cstatus);
		ManDao dao = new ManDao();
		int i = dao.editcar(cid, cname, cprice, ccount, cstatus);
		response.sendRedirect("check.action?type=checkcar");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doGet(request,response);
	}
}