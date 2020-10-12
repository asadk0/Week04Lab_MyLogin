
package servlets;

import domain.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author Asad - 759175
 */
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        HttpSession session = req.getSession(); 
        
        
        if(session.isNew()){
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
           
        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(req, res); 
             res.sendRedirect("home");
        }
       
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
    }

}
