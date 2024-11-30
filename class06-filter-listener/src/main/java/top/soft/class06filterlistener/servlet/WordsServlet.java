package top.soft.class06filterlistener.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 11448
 * @description: TODO
 * @date 2024/11/23 14:51
 */
@WebServlet("/wordsServlet")
public class WordsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String words = req.getParameter("words");
        PrintWriter writer = resp.getWriter();
        writer.write(words);
        writer.close();
    }
}
