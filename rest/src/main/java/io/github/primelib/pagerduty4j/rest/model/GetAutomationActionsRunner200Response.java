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
 * GetAutomationActionsRunner200Response
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
    "runner"
})
@JsonTypeName("getAutomationActionsRunner_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAutomationActionsRunner200Response {

    @JsonProperty("runner")
    protected AutomationActionsRunner runner;

    /**
     * Constructs a validated instance of {@link GetAutomationActionsRunner200Response}.
     *
     * @param spec the specification to process
     */
    public GetAutomationActionsRunner200Response(Consumer<GetAutomationActionsRunner200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAutomationActionsRunner200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAutomationActionsRunner200Response(Consumer)} instead.
     * @param runner var.name
     */
    @ApiStatus.Internal
    public GetAutomationActionsRunner200Response(AutomationActionsRunner runner) {
        this.runner = runner;
    }

}
