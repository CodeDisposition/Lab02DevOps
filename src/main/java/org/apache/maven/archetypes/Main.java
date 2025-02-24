package org.apache.maven.archetypes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;

@WebServlet("/display")
public class Main extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        String greeting;
        if (hour < 12) {
            greeting = "Good morning, Aneeb, Welcome to COMP367";
        } else {
            greeting = "Good afternoon, Aneeb, Welcome to COMP367";
        }

        request.setAttribute("greeting", greeting);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}