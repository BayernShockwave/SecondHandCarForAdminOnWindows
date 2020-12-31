package control;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Dao.*;
import Entity.*;
@WebServlet("/check.action")
public class CheckServlet extends HttpServlet {
	private ManDao dao=new ManDao();
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("userid");
		//System.out.println(id);
		String type=request.getParameter("type");
		String cid=request.getParameter("cid");
		ManDao dao = new ManDao();
		switch(type) {
		case "checkself":
			request.getSession().setAttribute("slist",dao.selectManById(id));
			response.sendRedirect("checkself.jsp");
			break;
		case "modifyself":
			request.getSession().setAttribute("slist",dao.selectManById(id));
			response.sendRedirect("modifyself.jsp");
			break;
		case "checkuser":
			request.getSession().setAttribute("ulist",dao.allUsers());
			response.sendRedirect("checkuser.jsp");
			break;
		case "checkcar":
			request.getSession().setAttribute("clist",dao.allCars());
			response.sendRedirect("checkcar.jsp");
			break;
		case "checkfindpwd":
			request.getSession().setAttribute("flist",dao.allFindPwds());
			response.sendRedirect("checkfindpwd.jsp");
			break;		
		case "checkdiary":
			response.sendRedirect("checkdiary.jsp");
			break;
		case "add":
			response.sendRedirect("addcar.jsp");
			break;
		case "edit":
			session.setAttribute("cid",cid);
			response.sendRedirect("editcar.jsp");
			break;
		case "delete":
			int i = dao.delcar(cid);
			response.sendRedirect("check.action?type=checkcar");
			break;
		}
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doGet(request,response);
	}
}