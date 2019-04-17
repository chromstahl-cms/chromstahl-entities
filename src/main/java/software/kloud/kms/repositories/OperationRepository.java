package software.kloud.kms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import software.kloud.kms.entities.OperationJpaRecord;

public interface OperationRepository extends JpaRepository<OperationJpaRecord, String> {
}
