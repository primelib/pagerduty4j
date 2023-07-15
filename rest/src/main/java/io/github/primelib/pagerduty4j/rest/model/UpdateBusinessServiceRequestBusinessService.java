package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateBusinessServiceRequestBusinessService
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "description",
    "point_of_contact",
    "team"
})
@JsonTypeName("updateBusinessService_request_business_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateBusinessServiceRequestBusinessService {

    /**
     * The name of the Business Service.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The description of the Business Service.
     */
    @JsonProperty("description")
    private String description;

    /**
     * The owner of the Business Service.
     */
    @JsonProperty("point_of_contact")
    private String pointOfContact;

    @JsonProperty("team")
    private Team2 team;


}
