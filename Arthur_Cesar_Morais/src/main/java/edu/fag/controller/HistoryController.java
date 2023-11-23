package edu.fag.controller;

import edu.fag.model.History;
import edu.fag.service.HistoryService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import static java.util.Objects.requireNonNull;

@Path("/history")
public class HistoryController {
    private final Template history;
    @Inject
    HistoryService historyService;

    public HistoryController(Template history) {
        this.history = requireNonNull(history, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        List<History> calculations = historyService.getAllHistories();
        return history.instance().data("calculations", calculations);
    }
}
