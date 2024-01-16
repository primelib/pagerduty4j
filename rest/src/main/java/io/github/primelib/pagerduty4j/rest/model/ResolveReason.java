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
 * ResolveReason
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
    "type",
    "incident"
})
@JsonTypeName("ResolveReason")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResolveReason {

    /**
     * The reason the incident was resolved. The only reason currently supported is merge.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("incident")
    protected IncidentReference incident;

    /**
     * Constructs a validated instance of {@link ResolveReason}.
     *
     * @param spec the specification to process
     */
    public ResolveReason(Consumer<ResolveReason> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResolveReason}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResolveReason(Consumer)} instead.
     * @param type The reason the incident was resolved. The only reason currently supported is merge.
     * @param incident incident
     */
    @ApiStatus.Internal
    public ResolveReason(TypeEnum type, IncidentReference incident) {
        this.type = type;
        this.incident = incident;
    }

    /**
     * The reason the incident was resolved. The only reason currently supported is merge.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MERGE_RESOLVE_REASON("merge_resolve_reason");

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
