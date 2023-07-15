package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConvertServiceEventRulesToEventOrchestration200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "convert_status",
    "converted_to"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration200Response {

    /**
     * Constructs a validated implementation of {@link ConvertServiceEventRulesToEventOrchestration200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConvertServiceEventRulesToEventOrchestration200Response(Consumer<ConvertServiceEventRulesToEventOrchestration200Response> spec) {
        spec.accept(this);
    }

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


}
