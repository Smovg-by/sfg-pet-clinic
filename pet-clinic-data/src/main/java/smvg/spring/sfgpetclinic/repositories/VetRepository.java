package smvg.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import smvg.spring.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
