import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxRequestServlet")
public class AjaxRequestServlet extends HttpServlet{
    
    @Override
        protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        //设置响应类型以及字符集
         response.setContentType("text/html;charset=utf-8");
         //获取响应流
         PrintWriter out = response.getWriter();
        //响应
         out.print("用户名已出错");
    }
    
}
