package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTeamUserRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "role"
})
@JsonTypeName("updateTeamUser_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateTeamUserRequest {

    /**
     * The role of the user on the team.
     */
    @JsonProperty("role")
    private RoleEnum role;


    /**
     * The role of the user on the team.
     */
    @AllArgsConstructor
    public enum RoleEnum {
        OBSERVER("observer"),
        RESPONDER("responder"),
        MANAGER("manager");

        private final String value;
    }

}
