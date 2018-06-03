package fr.wildcodeschool.githubtracker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = "/Githuber")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<GituberModel> gitlist = new ArrayList<GituberModel>();

        gitlist.add(new GituberModel("Name:" + " " + "hédi"));
        gitlist.add(new GituberModel("email:" + " " + "h_hedy@yahoo.fr"));
        gitlist.add(new GituberModel("login:" + " " + " dydy"));
        gitlist.add(new GituberModel("id:" +" " + "890"));
        gitlist.add(new GituberModel("avatarUrl:" +" " + "monster"));

        gitlist.add(new GituberModel("Name:" + " " + "doudou"));
        gitlist.add(new GituberModel("email:" + " " + "doudou@yahoo.fr"));
        gitlist.add(new GituberModel("login:" + " " + " doududu"));
        gitlist.add(new GituberModel("id:" +" " + "790"));
        gitlist.add(new GituberModel("avatarUrl:" +" " + "monster"));

        gitlist.add(new GituberModel("Name:" + " " + "lulu"));
        gitlist.add(new GituberModel("email:" + " " + "lulu@yahoo.fr"));
        gitlist.add(new GituberModel("login:" + " " + " loulou"));
        gitlist.add(new GituberModel("id:" +" " + "690"));
        gitlist.add(new GituberModel("avatarUrl:" +" " + "monster"));

        gitlist.add(new GituberModel("Name:" + " " + "coco"));
        gitlist.add(new GituberModel("email:" + " " + "coco@yahoo.fr"));
        gitlist.add(new GituberModel("login:" + " " + " coucou"));
        gitlist.add(new GituberModel("id:" +" " + "590"));
        gitlist.add(new GituberModel("avatarUrl:" +" " + "monster"));

        gitlist.add(new GituberModel("Name:" + " " + "valou"));
        gitlist.add(new GituberModel("email:" + " " + "valu@yahoo.fr"));
        gitlist.add(new GituberModel("login:" + " " + " val"));
        gitlist.add(new GituberModel("id:" +" " + "490"));
        gitlist.add(new GituberModel("avatarUrl:" +" " + "monster"));




        request.setAttribute("gitlistValue",gitlist);
        this.getServletContext().getRequestDispatcher("/list.jsp").forward(request, response);

    }
}
