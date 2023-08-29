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
 * OrchestrationRouterAllOfOrchestrationPathParent
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
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathParent {

    /**
     * ID of the Global Event Orchestration this Router belongs to.
     */
    @JsonProperty("id")
    protected Object id;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathParent}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouterAllOfOrchestrationPathParent(Consumer<OrchestrationRouterAllOfOrchestrationPathParent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathParent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouterAllOfOrchestrationPathParent(Consumer)} instead.
     * @param id ID of the Global Event Orchestration this Router belongs to.
     * @param type type
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathParent(Object id, TypeEnum type) {
        this.id = id;
        this.type = type;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        EVENT_ORCHESTRATION_REFERENCE("event_orchestration_reference");

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
