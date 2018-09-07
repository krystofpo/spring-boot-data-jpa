package app.persistence;

import app.persistence.Clovek;
import org.springframework.data.repository.CrudRepository;

public interface Dao extends CrudRepository<Clovek, Long> {

}
