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
 * AutomationActionsRunnerAllOfAssociatedActions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "actions",
    "more"
})
@JsonTypeName("AutomationActionsRunner_allOf_associated_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunnerAllOfAssociatedActions {

    @JsonProperty("actions")
    private List<AutomationActionsRunnerAllOfAssociatedActionsAllOfActionsInner> actions = new ArrayList<>();

    /**
     * Indicates whether more actions exist for the Runner.
     */
    @JsonProperty("more")
    private Boolean more;


}
