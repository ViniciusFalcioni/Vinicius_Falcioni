package edu.fag.dao;

import java.util.List;

import edu.fag.model.History;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CalculatorHistoryDAO {

    @Transactional
    public void save(History history) {
        history.persistAndFlush();
    }

    public List<History> getAllHistories() {
        return History.listAll();
    }

    public History getLatestHistory() {
        return History.findAll(Sort.descending("id")).firstResult();
    }
}