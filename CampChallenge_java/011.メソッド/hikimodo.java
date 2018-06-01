/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package メソッド;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hojo
 */
public class hikimodo extends HttpServlet {

    String[] myprofile(String pr){
        
        
        String[] user1={
            "111",
            "北條院 凶真<br>",
            "1991年12月14日生まれ<br>",
            "T都D区秋葉原???大檜山ビル2F未来ガジェット研究所<br>"
        };
        String[] user2={
            "222",
            "北条 承太郎<br>",
            "1970~1971年1月20日~2月18日<br>",
            "T都???区???<br>"
        };
        String[] user3={
            "333",
            "Hojorno Giovanna<br>",
            "1985年4月16日生まれ<br>",
            "M県S市紅葉区杜王町???<br>"
        };        
        
        
        if (pr.equals(user1[0])) {
            return user1;
        }
        if (pr.equals(user2[0])) {
            return user2;
        }
        if (pr.equals(user3[0])) {
            return user3;
        }
        
        return null;
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        String[] prof=myprofile("333");
        
        for(int i = 0; i<=3; i++){
            if(i == 0){
                continue;
            }
            out.print(prof[i]);
        }
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
