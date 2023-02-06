/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.web;

import Dominio.*;
import Negocio.ChaptersService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno Mañana
 */
@WebServlet("/chapters")
public class ChaptersServlet extends HttpServlet{
    // Ahora hacemos la inyección del componente EJB local al servlet
    @Inject
    // Ahora definimos nuestra variable
    ChaptersService chaptersService; // Cremos una instancia de nuestra if local
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse respose)
    throws ServletException, IOException {
        
        /** Ahora este método va acceder al listado de personas por medio
         * de la instancia que estamos recibiendo el EJB         
         */
        List<Chapters> chapters = chaptersService.findAllChapters();
        System.out.println("chapters: " + chapters);
        
        // Ponemos personas en un alcance
        request.setAttribute("chapters", chapters);
        
        // Redirigimos al JSP
        request.getRequestDispatcher("/listadoChapters.jsp").forward(request, 
                respose);
    }
}
