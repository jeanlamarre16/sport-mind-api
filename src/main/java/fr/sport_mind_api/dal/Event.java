package fr.sport_mind_api.dal;

import java.time.LocalDateTime;
import java.util.Date;

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
