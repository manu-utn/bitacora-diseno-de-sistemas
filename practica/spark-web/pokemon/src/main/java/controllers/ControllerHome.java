package controllers;

import pokemon.model.Usuario;
import pokemon.repositories.UsuarioRepositorio;
import spark.Request;
import spark.Response;
import spark.ModelAndView;

public class ControllerHome {
    public static ModelAndView index(Request request, Response response){
        Usuario usuario = UsuarioRepositorio.get().findAny();
        return new ModelAndView(usuario, "index.hbs");
    }

    // public static String index(Request req, Response res) {
    // 	 return "<html> <body> <h1>Hola</h1>" + UsuarioRepositorio.get().findAny() + " </body></html>";
    // }

}
