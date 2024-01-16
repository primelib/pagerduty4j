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
 * RelatedIncidentServiceDependencyBase
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
    "type",
    "self"
})
@JsonTypeName("RelatedIncidentServiceDependencyBase")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentServiceDependencyBase {

    /**
     * The ID of the Service referenced.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The type of the related Service.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The API show URL at which the object is accessible.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link RelatedIncidentServiceDependencyBase}.
     *
     * @param spec the specification to process
     */
    public RelatedIncidentServiceDependencyBase(Consumer<RelatedIncidentServiceDependencyBase> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RelatedIncidentServiceDependencyBase}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RelatedIncidentServiceDependencyBase(Consumer)} instead.
     * @param id The ID of the Service referenced.
     * @param type The type of the related Service.
     * @param self The API show URL at which the object is accessible.
     */
    @ApiStatus.Internal
    public RelatedIncidentServiceDependencyBase(String id, TypeEnum type, String self) {
        this.id = id;
        this.type = type;
        this.self = self;
    }

    /**
     * The type of the related Service.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BUSINESS_SERVICE_REFERENCE("business_service_reference"),
        TECHNICAL_SERVICE_REFERENCE("technical_service_reference");

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
