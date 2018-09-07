package app;

import app.persistence.Clovek;
import app.persistence.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Program {

    public Dao dao;

    @Autowired
    public Program(Dao dao) {
        this.dao = dao;
    }

    @Transactional
    public String zacni() {
        Clovek clovek = new Clovek();
        clovek.name = "kr";
        dao.save(clovek);
        clovek = null;
        clovek = dao.findOne(1L);
        return clovek.name;
    }
}
