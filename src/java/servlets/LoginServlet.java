
package servlets;

import domain.User;
import domain.AccountService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author Asad - 759175
 */
  
public class LoginServlet extends HttpServlet {
        
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        HttpSession session = req.getSession();
        
        String logout = (String) req.getParameter("logout");
        
        
        if (logout != "logout")
        {
            String msg = "Successfully logged out";
            req.setAttribute("message", msg);
            
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
        }
  
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
       
        HttpSession session = req.getSession();
        
        String uname = (String) req.getParameter("user");
        String pass = (String) req.getParameter("pass");
        
        AccountService as = new AccountService();
        User user = as.login(uname, pass);
        
            
        if(uname.equals("") || uname.equals(null) || pass.equals("") || pass.equals(null))
        {
            String msg = "Invalid Credentials";
            req.setAttribute("message", msg);
           
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
        }
        else
        {
            if(user != null){      
            session.setAttribute("user", user.getUsername());  
           
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(req, res);
        }
            else{
                String msg = "Invalid Credentials";
                req.setAttribute("message", msg);
                
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
            }
        }
        
        }
        
    }