package smvg.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import smvg.spring.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
