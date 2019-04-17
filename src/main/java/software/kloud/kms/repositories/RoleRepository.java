package software.kloud.kms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import software.kloud.kms.entities.RoleJpaRecord;

public interface RoleRepository extends JpaRepository<RoleJpaRecord, String> {

}
