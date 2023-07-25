package smvg.spring.sfgpetclinic.services;

import smvg.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
