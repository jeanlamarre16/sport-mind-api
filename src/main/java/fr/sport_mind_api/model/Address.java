package fr.sport_mind_api.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
    private Integer id;
    private String street;
    private int streetNumber;
    private String town;
    private String postalCode;
}
