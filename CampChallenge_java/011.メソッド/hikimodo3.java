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
public class hikimodo3 extends HttpServlet {

    ArrayList<String[]> myprofile(){
        
        
        String[] user1={
            "111",
            "北條院 凶真",
            "1991年12月14日生まれ",
            "T都D区秋葉原???大檜山ビル2F未来ガジェット研究所"
        };
        String[] user2={
            "222",
            "北条 承太郎",
            "1970~1971年1月20日~2月18日",
            null
        };
        String[] user3={
            "333",
            "Hojorno Giovanna",
            "1985年4月16日生まれ",
            "M県S市紅葉区杜王町???"
        }; 
        
        ArrayList<String[]> data = new ArrayList<String[]>();
        
        data.add(user1);
        data.add(user2);
        data.add(user3);
        
        
        return data;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            ArrayList<String[]> prof = myprofile(); 
            
            int limit = 2;
            
            for (int i = 0; i < limit; i++){
                String[] array =prof.get(i);
                
                for (int j = 0; j < array.length; j++){
                    if(array[j] == null){
                        continue;
                    }else{
                        out.print(array[j]+"<br>");
                    }
                }
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
