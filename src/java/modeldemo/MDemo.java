/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldemo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author manishpc
 */
public class MDemo {
    String uname;
    String upass;

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    
    public String getUname() {
        return uname;
    }

    public String getUpass() {
        return upass;
    }
    
    public boolean isValid()
    {
        String s1=getUname();
        String s2=getUpass();
       /* try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///ajava88?useSSL=false","root","root");
			Statement st = con.createStatement();
			String q = "select * from regis where UNAME='"+uname+"' AND UPASS='"+upass+"'";
			ResultSet rs = st.executeQuery(q);
			if(rs.next())
			{
                            return true;
                        }
                        else
                        {
                            return false;
                        }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        */
        if(uname.equals("abc") && upass.equals("123"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
