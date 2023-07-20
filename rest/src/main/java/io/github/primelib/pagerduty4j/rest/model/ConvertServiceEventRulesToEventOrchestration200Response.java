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
 * ConvertServiceEventRulesToEventOrchestration200Response
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
    "convert_status",
    "converted_to"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration200Response {

    /**
     * Did PagerDuty successfully create equivalent Event Orchestration rules
     */
    @JsonProperty("convert_status")
    protected String convertStatus;

    /**
     * the API URL at which the newly created Event Orchestration rules are accessible
     */
    @JsonProperty("converted_to")
    protected String convertedTo;

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration200Response}.
     *
     * @param spec the specification to process
     */
    public ConvertServiceEventRulesToEventOrchestration200Response(Consumer<ConvertServiceEventRulesToEventOrchestration200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConvertServiceEventRulesToEventOrchestration200Response(Consumer)} instead.
     * @param convertStatus Did PagerDuty successfully create equivalent Event Orchestration rules
     * @param convertedTo the API URL at which the newly created Event Orchestration rules are accessible
     */
    @ApiStatus.Internal
    public ConvertServiceEventRulesToEventOrchestration200Response(String convertStatus, String convertedTo) {
        this.convertStatus = convertStatus;
        this.convertedTo = convertedTo;
    }

}
