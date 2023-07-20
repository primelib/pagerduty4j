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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MergeIncidents200Response
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
    "incident"
})
@JsonTypeName("mergeIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MergeIncidents200Response {

    @JsonProperty("incident")
    protected IncidentReference incident;

    /**
     * Constructs a validated instance of {@link MergeIncidents200Response}.
     *
     * @param spec the specification to process
     */
    public MergeIncidents200Response(Consumer<MergeIncidents200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MergeIncidents200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MergeIncidents200Response(Consumer)} instead.
     * @param incident var.name
     */
    @ApiStatus.Internal
    public MergeIncidents200Response(IncidentReference incident) {
        this.incident = incident;
    }

}
