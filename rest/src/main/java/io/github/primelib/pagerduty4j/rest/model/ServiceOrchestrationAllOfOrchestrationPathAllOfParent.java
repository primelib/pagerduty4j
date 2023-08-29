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
 * ServiceOrchestrationAllOfOrchestrationPathAllOfParent
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
    "id",
    "type"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfParent {

    /**
     * The ID of the Service this Orchestration belongs to.
     */
    @JsonProperty("id")
    protected Object id;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfParent}.
     *
     * @param spec the specification to process
     */
    public ServiceOrchestrationAllOfOrchestrationPathAllOfParent(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfParent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfParent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceOrchestrationAllOfOrchestrationPathAllOfParent(Consumer)} instead.
     * @param id The ID of the Service this Orchestration belongs to.
     * @param type type
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfParent(Object id, TypeEnum type) {
        this.id = id;
        this.type = type;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        SERVICE_REFERENCE("service_reference");

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
