package controllers;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;


public class HomeController {
	public static ModelAndView home(Request req, Response res){
      HashMap<String, Object> model = new HashMap<>();
      Object usuario = req.session().attribute("usuario_logedo");

      model.put("usuario", usuario);

		return new ModelAndView(model, "home/home.hbs");
	}

}
