package hu.uni.eku.team3.service;

import hu.uni.eku.team3.dao.SummaryDao;
import hu.uni.eku.team3.model.Summary;
import hu.uni.eku.team3.service.exceptions.SummaryAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.SummaryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class SummaryServiceImpl implements SummaryService{
    private final SummaryDao dao;
    @Override
    public void create(Summary SummaryCreate) throws SummaryAlreadyExistsException {
        final boolean alreadyExists =dao.readAll()
                .stream()
                .allMatch(sl -> sl.getId() == SummaryCreate.getId());
        if (alreadyExists){
            throw new SummaryAlreadyExistsException(String.format("Summary (%s) already exists",SummaryCreate.toString()));
        }
        dao.create(SummaryCreate);
    }

    @Override
    public Collection<Summary> readAll() {
        return dao.readAll();
    }

    @Override
    public void update(Integer original, Summary updated) throws SummaryNotFoundException {

    }

    @Override
    public void delete(Integer SummaryDelete) throws SummaryNotFoundException {

    }
}
