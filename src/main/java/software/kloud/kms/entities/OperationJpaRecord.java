package software.kloud.kms.entities;


import software.kloud.kms.entities.util.KMSGrantedAuthorityAdapter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class OperationJpaRecord implements KMSGrantedAuthorityAdapter {
    @Id
    private String id;

    @Override
    public String getAuthority() {
        return id;
    }
}
