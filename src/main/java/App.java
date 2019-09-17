import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Hero;
import model.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> posts = Hero.getAll();
            model.put("posts", posts);
            return new ModelAndView(new HashMap(), "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> posts = Hero.getAll();
            model.put("posts", posts);
            return new ModelAndView(new HashMap(), "hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad1", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> posts = Hero.getAll();
            model.put("posts", posts);
            return new ModelAndView(new HashMap(), "squad-name.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes", request.session().attribute("heroes"));
            model.put("template", "templates/squad.hbs");
            return new ModelAndView(new HashMap(), "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroc", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squad2", request.session().attribute("squad2"));
            model.put("template", "templates/squad.hbs");
            return new ModelAndView(new HashMap(), "squad.hbs");
        }, new HandlebarsTemplateEngine());



        post("/heroes", (request, response) -> {
            Map<String, Object> modelu = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String superpower = request.queryParams("superpower");
            String weakness = request.queryParams("weakness");

            Hero newhero = new Hero(name, age, superpower, weakness);
            modelu.put("name",newhero.getName());
            modelu.put("age",newhero.getAge());
            modelu.put("superpower",newhero.getSuperpower());
            modelu.put("weakness",newhero.getWeakness());
            System.out.println(newhero);
            return new ModelAndView(new HashMap(), "check.hbs");
        },new HandlebarsTemplateEngine());


        post("/squad2", (request, response) -> {
            Map<String, Object> modelu = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String superpower = request.queryParams("superpower");
            String weakness = request.queryParams("weakness");

            Hero newhero = new Hero(name, age, superpower, weakness);
            modelu.put("name",newhero.getName());
            modelu.put("age",newhero.getAge());
            modelu.put("superpower",newhero.getSuperpower());
            modelu.put("weakness",newhero.getWeakness());
            modelu.put("template", "public/squad.hbs");
            return new ModelAndView(new HashMap(), "check-hero.hbs");
        },new HandlebarsTemplateEngine());
        }
}