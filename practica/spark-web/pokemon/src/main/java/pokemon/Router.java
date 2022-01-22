package pokemon;

import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

import controllers.ControllerHome;
import controllers.ControllerPokemon;
import controllers.ControllerUsuario;

public class Router {

	public static void configure() {
      HandlebarsTemplateEngine engineTemplate = new HandlebarsTemplateEngine();

      // Spark.get("/", ControllerHome::index);
      Spark.get("/", ControllerHome::index, engineTemplate);
      Spark.get("/usuario", ControllerUsuario::index, engineTemplate);
      Spark.get("/pokemones", ControllerPokemon::index, engineTemplate);
      //Spark.get("/", (request,response) -> ControllerHome.index(request, response), engineTemplate);

      // Spark.get("/", (request, response) ->{
      // }, engineTemplate);
	}

}
