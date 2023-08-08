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
 * CreateIncidentStatusUpdate200Response
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
    "status_update"
})
@JsonTypeName("createIncidentStatusUpdate_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentStatusUpdate200Response {

    @JsonProperty("status_update")
    protected StatusUpdate statusUpdate;

    /**
     * Constructs a validated instance of {@link CreateIncidentStatusUpdate200Response}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentStatusUpdate200Response(Consumer<CreateIncidentStatusUpdate200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentStatusUpdate200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentStatusUpdate200Response(Consumer)} instead.
     * @param statusUpdate statusUpdate
     */
    @ApiStatus.Internal
    public CreateIncidentStatusUpdate200Response(StatusUpdate statusUpdate) {
        this.statusUpdate = statusUpdate;
    }

}
