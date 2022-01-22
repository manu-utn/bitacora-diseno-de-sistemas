package controllers;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

import db.RepositorioConsultoras;
import model.Consultora;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class ConsultorasController implements WithGlobalEntityManager, TransactionalOps{

	public ModelAndView listar(Request req, Response res){
		Map<String, List<Consultora>> model = new HashMap<>();
		// List<Consultora> consultoras = RepositorioConsultoras.instancia.listar();

    String costoEstimadoProyecto = req.queryParams("proyectoCostoEstimado");

		List<Consultora> consultoras = RepositorioConsultoras
        .instancia.filtrarPorCostoDeProyecto(new BigDecimal(costoEstimadoProyecto));

		model.put("consultoras", consultoras);
		return new ModelAndView(model, "consultoras/index.hbs");
	}

	public ModelAndView mostrar(Request req, Response res){
		Map<String, Consultora> model = new HashMap<>();
		String id = req.params("id");

		Consultora consultora = RepositorioConsultoras.instancia.buscar(Long.parseLong(id));
		model.put("consultora", consultora);
		return new ModelAndView(model, "consultoras/show.hbs");
	}

	public ModelAndView nuevo(Request req, Response res){
		return new ModelAndView(null, "consultoras/new.hbs");
	}

	public Void crear(Request req, Response res){
      String nombre = req.queryParams("nombre");
      String cantidadDeEmpleados = req.queryParams("cantidadDeEmpleados");

      Consultora consultoraNueva = new Consultora(nombre, Integer.parseInt(cantidadDeEmpleados));

      withTransaction(() ->{
              RepositorioConsultoras.instancia.agregar(consultoraNueva);
          });
      //res.redirect("/proyectos");
		return null;
	}
}
