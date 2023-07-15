package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserRole
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "role",
    "resources"
})
@JsonTypeName("UserRole")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserRole {

    /**
     * The role of the user for a set of resources.
     */
    @JsonProperty("role")
    private RoleEnum role;

    @JsonProperty("resources")
    private List<Reference> resources;


    /**
     * The role of the user for a set of resources.
     */
    @AllArgsConstructor
    public enum RoleEnum {
        OBSERVER("observer"),
        RESPONDER("responder"),
        MANAGER("manager");

        private final String value;
    }

}
