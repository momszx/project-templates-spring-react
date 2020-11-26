package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.Summary;
import hu.uni.eku.team3.service.exceptions.SummaryAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.SummaryNotFoundException;

import java.util.Collection;

public interface SummaryService {
    void create(Summary summary) throws SummaryAlreadyExistsException;

    Collection<Summary> readAll();

    void update(Integer original, Summary updated) throws SummaryNotFoundException;

    void delete(Integer summaryId) throws SummaryNotFoundException;
}
