package controllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import pokemon.model.Usuario;
import pokemon.repositories.UsuarioRepositorio;
import spark.Request;
import spark.Response;
import spark.ModelAndView;

public class ControllerUsuario {
    public static ModelAndView index(Request request, Response response) {
        Usuario usuario = UsuarioRepositorio.get().findAny();

        Map<String, Object> modelo = new HashMap<>();
        modelo.put("hora", LocalDateTime.now());
        modelo.put("usuario", usuario);

        return new ModelAndView(modelo, "usuario.hbs");
    }

    // public static String index(Request req, Response res) {
    // return "<html> <body> <h1>Hola</h1>" + UsuarioRepositorio.get().findAny() + "
    // </body></html>";
    // }

}
