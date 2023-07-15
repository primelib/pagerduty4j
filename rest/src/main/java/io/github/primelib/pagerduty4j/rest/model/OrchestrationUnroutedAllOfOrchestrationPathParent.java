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
 * OrchestrationUnroutedAllOfOrchestrationPathParent
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathParent {

    /**
     * Constructs a validated implementation of {@link OrchestrationUnroutedAllOfOrchestrationPathParent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathParent(Consumer<OrchestrationUnroutedAllOfOrchestrationPathParent> spec) {
        spec.accept(this);
    }

    /**
     * ID of the Global Event Orchestration this Unrouted Orchestration belongs to.
     */
    @JsonProperty("id")
    protected Object id = null;

    @JsonProperty("type")
    protected TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        EVENT_ORCHESTRATION_REFERENCE("event_orchestration_reference");

        private final String value;
    }

}
