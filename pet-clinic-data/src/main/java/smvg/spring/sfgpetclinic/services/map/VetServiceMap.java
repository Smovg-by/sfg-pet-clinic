package smvg.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import smvg.spring.sfgpetclinic.model.Vet;
import smvg.spring.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return this.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
