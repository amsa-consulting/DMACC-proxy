package com.dmacc.dmaccproxy.model;

import lombok.Data;

import java.util.Date;

@Data
public class PathwaysJourney {
    private Integer pidm;
    private String bannerID;
    private String firstName;
    private String lastName;
    private Integer termCode;
    private String termDescription;
    private Integer applicationNumber;
    private String applicationStatusCode;
    private String applicationStatusDescription;
    private String applicationProgram;
    private String majorCode;
    private String majorDescription;
    private Date applicationDate;
    private Integer daysFromApplication;
    private String email;
    private String mobileNumber;
}
