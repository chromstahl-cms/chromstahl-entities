package software.kloud.kms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class OperationJpaRecord {
    @Id
    private String id;

    public String getId() {
        return id;
    }
}
