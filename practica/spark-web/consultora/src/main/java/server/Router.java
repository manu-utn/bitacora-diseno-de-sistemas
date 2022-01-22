package server;

import controllers.HomeController;
import controllers.ProyectosController;
import controllers.ConsultorasController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.utils.BooleanHelper;
import spark.utils.HandlebarsTemplateEngineBuilder;

public class Router {

	public static void configure() {
		HandlebarsTemplateEngine engine = HandlebarsTemplateEngineBuilder
				.create()
				.withDefaultHelpers()
				.withHelper("isTrue", BooleanHelper.isTrue)
				.build();

		Spark.staticFiles.location("/public");

		ProyectosController proyectosController = new ProyectosController();
    ConsultorasController consultorasController = new ConsultorasController();

    // si los métodos del controller son static (globales),
    // entonces no es necesario crear la instancia a la clase
		Spark.get("/", HomeController::home, engine);
		Spark.get("/proyectos", ProyectosController::listar2, engine);

    // si los métodos del controller no son static (globales),
    // debemos crear una instancia a la clase
		Spark.get("/proyectos", proyectosController::listar, engine);
		Spark.get("/proyectos/new", proyectosController::nuevo, engine);
		Spark.get("/proyectos/:id", proyectosController::mostrar, engine);

		Spark.post("/proyectos", proyectosController::crear);

		Spark.get("/consultoras", consultorasController::listar, engine);
		Spark.get("/consultoras/new", consultorasController::nuevo, engine);
		Spark.get("/consultoras/:id", consultorasController::mostrar, engine);
		Spark.post("/consultoras", consultorasController::crear);
	}

}
