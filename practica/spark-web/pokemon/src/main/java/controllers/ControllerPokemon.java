package controllers;

import java.util.HashMap;
import java.util.List;

import com.google.common.base.Optional;

import pokemon.model.Captura;
import pokemon.model.Usuario;
import pokemon.repositories.UsuarioRepositorio;
import spark.Request;
import spark.Response;
import spark.ModelAndView;


public class ControllerPokemon {
    public static ModelAndView index(Request request, Response response){
        Usuario usuario = UsuarioRepositorio.get().findAny();
        String apodo = request.queryParams("apodo");

        List<Captura> capturas = Optional.fromNullable(apodo)
            .transform(it -> usuario.findByApodo(it))
            .or(usuario.getCapturas());

        HashMap<String, Object> viewModel = new HashMap<>();
        viewModel.put("apodo", apodo);
        viewModel.put("capturas", capturas);

        return new ModelAndView(viewModel, "pokemones.hbs");
    }
}
