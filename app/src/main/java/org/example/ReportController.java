package org.example;

import static spark.Spark.*;

import java.io.StringWriter;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class ReportController {
    public static void setupRoutes() {
get("/report", (req, res) -> {
    try {
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty("resource.loader", "class");
        ve.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        ve.init();

        Template template = ve.getTemplate("templates/report.vm");


        List<Case> cases = List.of(
            new Case("1"),
            new Case("2"),
            new Case("3")
        );

        VelocityContext context = new VelocityContext();
        context.put("cases", cases);
        context.put("date", new java.util.Date().toString());

        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        res.type("text/html");
        return writer.toString();
    } catch (Exception e) {
        e.printStackTrace(); // 👈 Log to stderr
        res.status(500);
        return "Internal Server Error: " + e.getMessage();
    }
});
    }
}

