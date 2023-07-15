package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListIncidentRelatedChangeEvents200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "change_events"
})
@JsonTypeName("listIncidentRelatedChangeEvents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentRelatedChangeEvents200Response {

    /**
     * Constructs a validated implementation of {@link ListIncidentRelatedChangeEvents200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListIncidentRelatedChangeEvents200Response(Consumer<ListIncidentRelatedChangeEvents200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("change_events")
    protected List<ListIncidentRelatedChangeEvents200ResponseChangeEventsInner> changeEvents;


}
