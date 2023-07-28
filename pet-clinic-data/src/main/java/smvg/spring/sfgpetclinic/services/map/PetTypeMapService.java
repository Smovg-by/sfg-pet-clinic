package smvg.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import smvg.spring.sfgpetclinic.model.PetType;
import smvg.spring.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(PetType object) {

    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
