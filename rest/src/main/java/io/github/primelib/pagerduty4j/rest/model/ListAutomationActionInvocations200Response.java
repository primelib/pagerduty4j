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
 * ListAutomationActionInvocations200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "invocations"
})
@JsonTypeName("listAutomationActionInvocations_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAutomationActionInvocations200Response {

    /**
     * List of invocations sorted by creation_time in reverse chronological order (newest invocations first). At most 25 invocations are returned.
     */
    @JsonProperty("invocations")
    private List<AutomationActionsInvocation> invocations = new ArrayList<>();


}
