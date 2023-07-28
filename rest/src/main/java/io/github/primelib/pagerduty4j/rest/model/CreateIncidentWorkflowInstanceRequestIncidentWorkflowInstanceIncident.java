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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident
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
    "type"
})
@JsonTypeName("createIncidentWorkflowInstance_request_incident_workflow_instance_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident {

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident(Consumer<CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident(Consumer)} instead.
     * @param type var.name
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident(TypeEnum type) {
        this.type = type;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_REFERENCE("incident_reference");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
