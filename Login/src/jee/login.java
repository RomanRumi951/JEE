package jee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Connection conn;
		String URL, Username, Password, Qry="INSERT INTO `tbl_user`(`name`, `password`) VALUES ('txtName','txtPass')";
		response.setContentType("text/html");
		Statement stmt;
		PrintWriter out = response.getWriter();
		URL = "";
		Username = "root";
		Password = "";
		try {
			ResultSet rs = stmt.executeQuery(Qry);
//			Class.forName("com.mysql.");
			out.print("<p>Class Loaded</p>");
//			conn = Driver.manager.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
