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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListIncidentRelatedChangeEvents200Response
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
    "change_events"
})
@JsonTypeName("listIncidentRelatedChangeEvents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentRelatedChangeEvents200Response {

    @JsonProperty("change_events")
    protected List<ListIncidentRelatedChangeEvents200ResponseChangeEventsInner> changeEvents;

    /**
     * Constructs a validated instance of {@link ListIncidentRelatedChangeEvents200Response}.
     *
     * @param spec the specification to process
     */
    public ListIncidentRelatedChangeEvents200Response(Consumer<ListIncidentRelatedChangeEvents200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListIncidentRelatedChangeEvents200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListIncidentRelatedChangeEvents200Response(Consumer)} instead.
     * @param changeEvents var.name
     */
    @ApiStatus.Internal
    public ListIncidentRelatedChangeEvents200Response(List<ListIncidentRelatedChangeEvents200ResponseChangeEventsInner> changeEvents) {
        this.changeEvents = changeEvents;
    }

}
