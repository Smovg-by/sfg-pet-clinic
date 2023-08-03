package smvg.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import smvg.spring.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
