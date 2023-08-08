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
 * UpdateIncident200Response
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
@JsonTypeName("updateIncident_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncident200Response {

    @JsonProperty("incident")
    protected Incident incident;

    /**
     * Constructs a validated instance of {@link UpdateIncident200Response}.
     *
     * @param spec the specification to process
     */
    public UpdateIncident200Response(Consumer<UpdateIncident200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIncident200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIncident200Response(Consumer)} instead.
     * @param incident incident
     */
    @ApiStatus.Internal
    public UpdateIncident200Response(Incident incident) {
        this.incident = incident;
    }

}
