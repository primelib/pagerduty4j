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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UserRole
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
    protected RoleEnum role;

    @JsonProperty("resources")
    protected List<Reference> resources;

    /**
     * Constructs a validated instance of {@link UserRole}.
     *
     * @param spec the specification to process
     */
    public UserRole(Consumer<UserRole> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserRole}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserRole(Consumer)} instead.
     * @param role The role of the user for a set of resources.
     * @param resources var.name
     */
    @ApiStatus.Internal
    public UserRole(RoleEnum role, List<Reference> resources) {
        this.role = role;
        this.resources = resources;
    }

    /**
     * The role of the user for a set of resources.
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
