package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Calculator calc = new Calculator();
        int result = calc.add(5, 3);

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Result from Calculator: 5 + 3 = " + result + "</h2>");
    }
}
