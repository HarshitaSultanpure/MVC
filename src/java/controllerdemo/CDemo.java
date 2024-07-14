package controllerdemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import modeldemo.MDemo;

public class CDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out=response.getWriter();
        String s1=request.getParameter("u1");
        String s2=request.getParameter("u2");
        
        MDemo m=new MDemo();
        
        m.setUname(s1);
        m.setUpass(s2);
        
        if(m.isValid())
        {
            response.sendRedirect("menu.jsp");
        }
        else
        {
            //out.println(m.getUname());
            //out.println(m.getUpass());
            response.sendRedirect("login.jsp");
        }
    }
}
