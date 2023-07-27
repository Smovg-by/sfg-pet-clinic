package smvg.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import smvg.spring.sfgpetclinic.model.Owner;
import smvg.spring.sfgpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll(); //super - т.к. мы ссылаемся не на текущий класс, а на родителя, т.е. AbstractMapService
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
