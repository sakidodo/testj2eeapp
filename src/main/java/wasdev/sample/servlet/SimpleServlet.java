package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//STEP 1. Import required packages
import java.sql.*;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    //JBDC driver name and database URL (Database credentials)
    static final String JDBC_URL = "jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/ad_c044be4d4a601c9?user=beb0c072c5678f&password=879adaa7";

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	StringBuilder msgPage = new StringBuilder();
    	msgPage.append("<br>STEP 1. Import required packages");
    	
        response.setContentType("text/html");
        response.getWriter().print("Hello World!");
    }

}
