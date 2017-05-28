package controllers;

import play.mvc.*;

/**
 * Application's home page controller.
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

}
