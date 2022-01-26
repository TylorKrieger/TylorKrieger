package com.krieger.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude()
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Contact {
    private String name;
    private int number;
    private int spending;
    private int total;
    private String contactId;
    private char isDeleted;
}
