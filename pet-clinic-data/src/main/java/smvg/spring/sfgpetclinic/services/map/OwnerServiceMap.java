package smvg.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import smvg.spring.sfgpetclinic.model.Owner;
import smvg.spring.sfgpetclinic.model.Pet;
import smvg.spring.sfgpetclinic.services.OwnerService;
import smvg.spring.sfgpetclinic.services.PetService;
import smvg.spring.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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

        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is Required");
                    }

                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);

        } else {
            return null;
        }
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
