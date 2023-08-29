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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAutomationActionsInvocation200Response
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
    "invocation"
})
@JsonTypeName("getAutomationActionsInvocation_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAutomationActionsInvocation200Response {

    @JsonProperty("invocation")
    protected AutomationActionsInvocation invocation;

    /**
     * Constructs a validated instance of {@link GetAutomationActionsInvocation200Response}.
     *
     * @param spec the specification to process
     */
    public GetAutomationActionsInvocation200Response(Consumer<GetAutomationActionsInvocation200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAutomationActionsInvocation200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAutomationActionsInvocation200Response(Consumer)} instead.
     * @param invocation invocation
     */
    @ApiStatus.Internal
    public GetAutomationActionsInvocation200Response(AutomationActionsInvocation invocation) {
        this.invocation = invocation;
    }

}
