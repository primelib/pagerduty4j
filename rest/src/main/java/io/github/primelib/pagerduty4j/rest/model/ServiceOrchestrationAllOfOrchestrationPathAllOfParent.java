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
 * ServiceOrchestrationAllOfOrchestrationPathAllOfParent
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
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfParent {

    /**
     * Constructs a validated implementation of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfParent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfParent(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfParent> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the Service this Orchestration belongs to.
     */
    @JsonProperty("id")
    protected Object id = null;

    @JsonProperty("type")
    protected TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        SERVICE_REFERENCE("service_reference");

        private final String value;
    }

}
