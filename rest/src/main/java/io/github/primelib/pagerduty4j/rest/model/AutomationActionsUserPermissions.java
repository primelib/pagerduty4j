package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsUserPermissions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "permissions"
})
@JsonTypeName("AutomationActionsUserPermissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsUserPermissions {

    /**
     * Constructs a validated implementation of {@link AutomationActionsUserPermissions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsUserPermissions(Consumer<AutomationActionsUserPermissions> spec) {
        spec.accept(this);
    }

    @JsonProperty("permissions")
    protected List<PermissionsEnum> permissions = new ArrayList<>();


    @AllArgsConstructor
    public enum PermissionsEnum {
        CREATE("create"),
        UPDATE("update"),
        DELETE("delete"),
        INVOKE("invoke");

        private final String value;
    }

}
