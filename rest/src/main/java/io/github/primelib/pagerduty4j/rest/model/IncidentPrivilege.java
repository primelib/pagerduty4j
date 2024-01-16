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
 * IncidentPrivilege
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
    "permissions"
})
@JsonTypeName("IncidentPrivilege")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentPrivilege {

    @JsonProperty("role")
    protected RoleEnum role;

    @JsonProperty("permissions")
    protected List<PermissionsEnum> permissions;

    /**
     * Constructs a validated instance of {@link IncidentPrivilege}.
     *
     * @param spec the specification to process
     */
    public IncidentPrivilege(Consumer<IncidentPrivilege> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentPrivilege}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentPrivilege(Consumer)} instead.
     * @param role role
     * @param permissions permissions
     */
    @ApiStatus.Internal
    public IncidentPrivilege(RoleEnum role, List<PermissionsEnum> permissions) {
        this.role = role;
        this.permissions = permissions;
    }

    @AllArgsConstructor
    public enum RoleEnum {
        ADMIN("admin"),
        MANAGER("manager"),
        OBSERVER("observer"),
        OWNER("owner"),
        READ_ONLY("read_only"),
        RESPONDER("responder"),
        TEAM_RESPONDER("team_responder"),
        READ_ONLY_LIMITED_USER("read_only_limited_user"),
        NONE("none");

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

    @AllArgsConstructor
    public enum PermissionsEnum {
        CREATE("create"),
        UPDATE("update"),
        DESTROY("destroy"),
        NEW("new"),
        EDIT("edit"),
        CRUD("crud"),
        DELETE("delete"),
        MANAGE("manage"),
        ADD("add"),
        INDEX("index"),
        READ("read"),
        SHOW("show"),
        MANAGE_INCIDENTS("manage_incidents"),
        MANUALLY_TRIGGER_INCIDENT("manually_trigger_incident");

        private static final PermissionsEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PermissionsEnum of(String input) {
            if (input != null) {
                for (PermissionsEnum v : VALUES) {
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
