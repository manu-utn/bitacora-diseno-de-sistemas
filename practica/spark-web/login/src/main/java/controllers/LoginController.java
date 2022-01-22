package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class LoginController {
	public static ModelAndView show(Request req, Response res){
      if(req.session().attribute("usuario_logeado") !=null)
          res.redirect("/home");

      /*
        if(req.cookie("usuario_logeado") != null)
        res.redirect("/home");
      */

      return new ModelAndView(null, "home/login.hbs");
	}

	public static ModelAndView login(Request req, Response res) {
      String nombre=req.queryParams("usuario");

      //res.cookie("usuario_logeado", nombre);
    req.session().attribute("usuario_logeado", nombre);
		res.redirect("/home");
		return null;
	}

}
