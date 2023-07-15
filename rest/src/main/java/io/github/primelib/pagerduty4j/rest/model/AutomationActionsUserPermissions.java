package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "permissions"
})
@JsonTypeName("AutomationActionsUserPermissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsUserPermissions {

    @JsonProperty("permissions")
    private List<PermissionsEnum> permissions = new ArrayList<>();


    @AllArgsConstructor
    public enum PermissionsEnum {
        CREATE("create"),
        UPDATE("update"),
        DELETE("delete"),
        INVOKE("invoke");

        private final String value;
    }

}
