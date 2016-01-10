package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by bohdan on 09.01.16.
 */
public class Test {

    @Id @GeneratedValue
    protected int id;

    protected int fieldId;

    protected List<String> questions;

    @JsonIgnore
    protected List<String> answers;

}
