package com.github.vinicius.checkpoint2.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

import static jakarta.persistence.GenerationType.AUTO;

@MappedSuperclass
public class AbstractEntity<ID> implements Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}