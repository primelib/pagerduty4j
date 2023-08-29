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
 * ListChangeEvents200Response
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
@JsonTypeName("listChangeEvents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListChangeEvents200Response {

    @JsonProperty("change_events")
    protected List<ChangeEvent> changeEvents;

    /**
     * Constructs a validated instance of {@link ListChangeEvents200Response}.
     *
     * @param spec the specification to process
     */
    public ListChangeEvents200Response(Consumer<ListChangeEvents200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListChangeEvents200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListChangeEvents200Response(Consumer)} instead.
     * @param changeEvents changeEvents
     */
    @ApiStatus.Internal
    public ListChangeEvents200Response(List<ChangeEvent> changeEvents) {
        this.changeEvents = changeEvents;
    }

}
