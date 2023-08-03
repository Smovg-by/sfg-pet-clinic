package smvg.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import smvg.spring.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
