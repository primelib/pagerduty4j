package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UpdateTeamUserRequest
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    protected RoleEnum role;

    /**
     * Constructs a validated instance of {@link UpdateTeamUserRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateTeamUserRequest(Consumer<UpdateTeamUserRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateTeamUserRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateTeamUserRequest(Consumer)} instead.
     * @param role The role of the user on the team.
     */
    @ApiStatus.Internal
    public UpdateTeamUserRequest(RoleEnum role) {
        this.role = role;
    }

    /**
     * The role of the user on the team.
     */
    @AllArgsConstructor
    public enum RoleEnum {
        OBSERVER("observer"),
        RESPONDER("responder"),
        MANAGER("manager");

        private static final RoleEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RoleEnum of(String input) {
            if (input != null) {
                for (RoleEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
