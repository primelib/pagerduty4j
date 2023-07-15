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
 * ListAutomationActionInvocations200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "invocations"
})
@JsonTypeName("listAutomationActionInvocations_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAutomationActionInvocations200Response {

    /**
     * Constructs a validated implementation of {@link ListAutomationActionInvocations200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListAutomationActionInvocations200Response(Consumer<ListAutomationActionInvocations200Response> spec) {
        spec.accept(this);
    }

    /**
     * List of invocations sorted by creation_time in reverse chronological order (newest invocations first). At most 25 invocations are returned.
     */
    @JsonProperty("invocations")
    protected List<AutomationActionsInvocation> invocations = new ArrayList<>();


}
