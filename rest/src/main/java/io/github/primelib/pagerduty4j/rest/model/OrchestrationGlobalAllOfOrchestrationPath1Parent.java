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
 * OrchestrationGlobalAllOfOrchestrationPath1Parent
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
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1Parent {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPath1Parent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1Parent(Consumer<OrchestrationGlobalAllOfOrchestrationPath1Parent> spec) {
        spec.accept(this);
    }

    /**
     * ID of the Global Event Orchestration these Global Rules belongs to.
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
