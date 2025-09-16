import jakarta.persistence.*;

@Entity
public class EntityName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String someField;

    protected EntityName() {
    }

    public EntityName(String someField ) {
        this.someField = someField;
    
    }

    public Long getId() {
        return id;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

}
package com.wellsfargo.counselor.entity;