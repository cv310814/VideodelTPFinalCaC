package py.starwars.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import py.starwars.data.PeliculaDAO;
import py.starwars.model.Pelicula;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet("/movies")
public class MovieServletController extends HttpServlet {
   
    static Logger logger = LoggerFactory.getLogger(MovieServletController.class);
    List<Pelicula> movieList = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String route = req.getParameter("action");
        logger.info("route : " + route);
        switch (route) {
            case "getAll" -> {
                res.setContentType("application/json; charset=UTF-8");
                movieList = PeliculaDAO.obtener();
                logger.info("Dentro de getAll : " + movieList.size());
                //transformo en json y lo envio
                mapper.writeValue(res.getWriter(), movieList);
                logger.info(mapper.toString());
            }

            default -> {
                logger.info("Parámetro no válido");
            }
        }   
    }

    //En el doPost enviamos los datos del formulario a java para que los 
    //inserte en la base de datos.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //String route = req.getParameter("action");
        String route = "add";
        logger.info("Dentro del doPost()");
        logger.info("route : " + route );
        logger.info("req : " + req);
        logger.info("req : " + req.getParameter("nombre"));
        switch (route) {
            case "add" -> {
                String nombre = req.getParameter("nombre");
                String descripcion = req.getParameter("descripcion");
                String genero = req.getParameter("genero");
                String calificacion = req.getParameter("calificacion");
                int anio = Integer.parseInt(req.getParameter("anio"));
                int estrellas = Integer.parseInt(req.getParameter("estrellas"));
                String director = req.getParameter("director");
                logger.info(nombre,descripcion,genero,calificacion,anio, estrellas, director);

                Pelicula newMovie = new Pelicula(nombre, descripcion, genero, calificacion, anio, estrellas, director);

                //Hardcodeo una peli
                Pelicula hardMovie = new Pelicula("hard", "hard", "hard", "hard" ,2024, 5, "hard");
                PeliculaDAO.insertar(hardMovie);

                res.setContentType("application/json; charset-UTF8");
                Map<String, String> response = new HashMap();
                response.put("message", "Pelicula guardada exitosamente");
                mapper.writeValue(res.getWriter(), response);

            }
                
        }

    }
}


