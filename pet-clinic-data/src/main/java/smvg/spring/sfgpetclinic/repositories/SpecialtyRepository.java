package smvg.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import smvg.spring.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
