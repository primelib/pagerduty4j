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
 * PutIncidentManualBusinessServiceAssociation200Response
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
    "relation"
})
@JsonTypeName("putIncidentManualBusinessServiceAssociation_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutIncidentManualBusinessServiceAssociation200Response {

    @JsonProperty("relation")
    protected RelationEnum relation;

    /**
     * Constructs a validated instance of {@link PutIncidentManualBusinessServiceAssociation200Response}.
     *
     * @param spec the specification to process
     */
    public PutIncidentManualBusinessServiceAssociation200Response(Consumer<PutIncidentManualBusinessServiceAssociation200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PutIncidentManualBusinessServiceAssociation200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PutIncidentManualBusinessServiceAssociation200Response(Consumer)} instead.
     * @param relation relation
     */
    @ApiStatus.Internal
    public PutIncidentManualBusinessServiceAssociation200Response(RelationEnum relation) {
        this.relation = relation;
    }

    @AllArgsConstructor
    public enum RelationEnum {
        IMPACTED("impacted"),
        NOT_IMPACTED("not_impacted");

        private static final RelationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RelationEnum of(String input) {
            if (input != null) {
                for (RelationEnum v : VALUES) {
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
