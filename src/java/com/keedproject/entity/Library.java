package com.keedproject.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@Entity
public class Library {

    @Id
    @GeneratedValue
    private int albumId;

}
