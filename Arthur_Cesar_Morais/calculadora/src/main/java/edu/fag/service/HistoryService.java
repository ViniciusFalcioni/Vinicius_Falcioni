package edu.fag.service;

import edu.fag.dao.CalculatorHistoryDAO;
import edu.fag.model.History;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class HistoryService {

    @Inject
    CalculatorHistoryDAO historyDao;

    public HistoryService() { }

    public void saveHistory(History history) {
        historyDao.save(history);
    }

    public List<History> getAllHistories() {
        return historyDao.getAllHistories();
    }

    public History getLatestHistory() { return historyDao.getLatestHistory(); }
}
