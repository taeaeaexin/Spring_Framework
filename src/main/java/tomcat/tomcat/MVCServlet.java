package tomcat.tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

// servlet : 다양한 request에 대한 어떤 클래스의 메소드가 처리해야 하는지에 대한 제어
// job prarameter를 request에서 구분해서 처리
@WebServlet("/mvc")
public class MVCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    //검색어
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // job parameter 값 확인
        String job = request.getParameter("job");

        switch(job){
            //forwarding
            case "list" :
                List<String> strList = getList();
                request.setAttribute("strList", strList);
                request.getRequestDispatcher("/mvc.jsp").forward(request, response);
                break;

            //redirection
            //302 응답 ; redirection
            //최초 redirection :
            case "info" :
                response.sendRedirect("/aaa/info2.html");
                break;
        }
    }

    private List<String> getList (){
        List<String> strList = List.of("java", "servlet", "jsp"); // service, dao layer 통해 구한 결과로 가정
        return strList;
    }

//    private String getDetail (){
//        String str = ("java"); // service, dao layer 통해 구한 결과로 가정
//        return str;
//    }
}