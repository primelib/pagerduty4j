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
 * AutomationActionsUserPermissions
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
    "permissions"
})
@JsonTypeName("AutomationActionsUserPermissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsUserPermissions {

    @JsonProperty("permissions")
    protected List<PermissionsEnum> permissions;

    /**
     * Constructs a validated instance of {@link AutomationActionsUserPermissions}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsUserPermissions(Consumer<AutomationActionsUserPermissions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsUserPermissions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsUserPermissions(Consumer)} instead.
     * @param permissions var.name
     */
    @ApiStatus.Internal
    public AutomationActionsUserPermissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
    }

    @AllArgsConstructor
    public enum PermissionsEnum {
        CREATE("create"),
        UPDATE("update"),
        DELETE("delete"),
        INVOKE("invoke");

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
