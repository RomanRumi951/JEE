package jee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.jdbc.Driver;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Connection conn;
		Statement stmt = null;
		String URL, qry, Username, Password;
		Username = "root";
		Password = "";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		URL = "jdbc:mysql://localhost:3306/hjd";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			out.println("<p>Class Load");
			conn = DriverManager.getConnection(URL, Username, Password);
			out.println("<p>Connection...");
			stmt = conn.createStatement();
				
			String u = request.getParameter("txtName");
			String p = request.getParameter("txtPass");
			qry = "INSERT INTO `tbl_user`(`name`, `password`) VALUES ('"+u+"','"+p+"')";
			
			stmt.execute(qry);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}