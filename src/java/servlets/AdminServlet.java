package servlets;

import entity.Person;
import entity.Subject;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.PersonFacade;
import session.SubjectFacade;


@WebServlet(name = "AdminServlet", urlPatterns = {
    "/showNewSubject",
    "/addSubject",
    "/showNewPerson",
    "/addPerson",
    "/showNewJournal",
})
public class AdminServlet extends HttpServlet {
    @EJB private SubjectFacade subjectFacade;
    @EJB private PersonFacade personFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        switch (request.getServletPath()) {
            case "/showNewSubject":
                request.getRequestDispatcher("/showNewSubject.jsp")
                        .forward(request, response);
                break;
            case "/addSubject":
                String subjectName = request.getParameter("subjectName");
                String subjectHours = request.getParameter("subjectHours");
                if(subjectName == null || "".equals(subjectName)
                        || subjectHours == null || "".equals(subjectHours)){
                    request.setAttribute("subjectName",subjectName);
                    request.setAttribute("subjectHours",subjectHours);
                    request.setAttribute("info", "Заполните все поля!");
                    request.getRequestDispatcher("/showNewSubject.jsp")
                            .forward(request, response);
                }
                Subject subject = new Subject(subjectName, subjectHours);
                subjectFacade.create(subject);
                request.setAttribute("info", "Предмет \""+subject.getSubjectName()+"\" добавлен в базу");
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                break;
            case "/showNewPerson":
                request.getRequestDispatcher("/showNewPerson.jsp")
                        .forward(request, response);
                break;
            case "/addPerson":
                String name = request.getParameter("name");
                String lastName = request.getParameter("lastName");
                String isikukood = request.getParameter("isikukood");
                String personi = request.getParameter("personi");
                
                if(name == null || "".equals(name)
                        || lastName == null || "".equals(lastName)
                        || personi == null || "".equals(personi)
                        || isikukood == null || "".equals(isikukood)){
                    request.setAttribute("name",name);
                    request.setAttribute("lastName",lastName);
                    request.setAttribute("personi",personi);
                    request.setAttribute("isikukood",isikukood);
                    request.setAttribute("info", "Заполните все поля!");
                    request.getRequestDispatcher("/showNewPerson.jsp")
                            .forward(request, response);
                }

                Person person = null;
                try{
                    person = new Person(name, lastName, personi, isikukood);
                    personFacade.create(person);
                } catch(Exception e) {
                    if(person != null){
                        personFacade.remove(person);
                    }
                }
                request.setAttribute("info", "Учитель/Ученик \""+person.getName() + " " + person.getLastName() + "\" добавлен в базу");
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                    break;
                case "/showNewJournal":
                List<Person> listPersons = personFacade.findAll();
                List<Subject> listSubjects = subjectFacade.findAll();
                request.setAttribute("listPersons", listPersons);
                request.setAttribute("listSubjects", listSubjects);
                request.getRequestDispatcher("/showNewJournal.jsp")
                        .forward(request, response);
                    break;
               
             
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
