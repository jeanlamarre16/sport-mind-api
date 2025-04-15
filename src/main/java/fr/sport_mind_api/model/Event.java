package fr.sport_mind_api.model;

import java.time.LocalDateTime;

public class Event {
    private Integer id;
    private Sport sport;
    private String location;
    private int nbMax;
    private Address address;
    private boolean isRequipmentRequired;
    private Users user;
    private String description;
    private LocalDateTime dateTime;
}
