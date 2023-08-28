package pweb2.form.Respositories;


import org.springframework.data.repository.CrudRepository;

import pweb2.form.Models.User;

public interface UserRepository extends CrudRepository< User, Long > {
  
}
