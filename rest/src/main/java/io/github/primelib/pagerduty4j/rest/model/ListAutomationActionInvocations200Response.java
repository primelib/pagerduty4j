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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListAutomationActionInvocations200Response
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
    "invocations"
})
@JsonTypeName("listAutomationActionInvocations_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAutomationActionInvocations200Response {

    /**
     * List of invocations sorted by creation_time in reverse chronological order (newest invocations first). At most 25 invocations are returned.
     */
    @JsonProperty("invocations")
    protected List<AutomationActionsInvocation> invocations;

    /**
     * Constructs a validated instance of {@link ListAutomationActionInvocations200Response}.
     *
     * @param spec the specification to process
     */
    public ListAutomationActionInvocations200Response(Consumer<ListAutomationActionInvocations200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListAutomationActionInvocations200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListAutomationActionInvocations200Response(Consumer)} instead.
     * @param invocations List of invocations sorted by creation_time in reverse chronological order (newest invocations first). At most 25 invocations are returned.
     */
    @ApiStatus.Internal
    public ListAutomationActionInvocations200Response(List<AutomationActionsInvocation> invocations) {
        this.invocations = invocations;
    }

}
