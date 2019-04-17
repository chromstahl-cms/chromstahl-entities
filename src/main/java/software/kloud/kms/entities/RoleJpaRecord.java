package software.kloud.kms.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleJpaRecord {

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<OperationJpaRecord> allowedOperationJpaRecords = new ArrayList<>();
    @Id
    private String id;
    @OneToMany
    @JsonBackReference
    private List<UserJpaRecord> userJpaRecordList;

    public RoleJpaRecord() {
    }

    public RoleJpaRecord(String id, UserJpaRecord user, OperationJpaRecord ...operations) {
        this.id = id;
        this.userJpaRecordList = List.of(user);
        this.allowedOperationJpaRecords = List.of(operations);
    }

    public RoleJpaRecord(String id, List<OperationJpaRecord> allowedOperationJpaRecords) {
        this.allowedOperationJpaRecords = allowedOperationJpaRecords;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<UserJpaRecord> getUserJpaRecordList() {
        return userJpaRecordList;
    }

    public void setUserJpaRecordList(List<UserJpaRecord> userJpaRecordList) {
        this.userJpaRecordList = userJpaRecordList;
    }

    public List<OperationJpaRecord> getAllowedOperations() {
        return allowedOperationJpaRecords;
    }
}
