package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTeamUserRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "role"
})
@JsonTypeName("updateTeamUser_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateTeamUserRequest {

    /**
     * Constructs a validated implementation of {@link UpdateTeamUserRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateTeamUserRequest(Consumer<UpdateTeamUserRequest> spec) {
        spec.accept(this);
    }

    /**
     * The role of the user on the team.
     */
    @JsonProperty("role")
    protected RoleEnum role;


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
