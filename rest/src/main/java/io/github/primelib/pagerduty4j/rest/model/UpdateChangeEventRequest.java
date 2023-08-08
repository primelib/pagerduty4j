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
 * UpdateChangeEventRequest
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
    "change_event"
})
@JsonTypeName("updateChangeEvent_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateChangeEventRequest {

    @JsonProperty("change_event")
    protected ChangeEvent changeEvent;

    /**
     * Constructs a validated instance of {@link UpdateChangeEventRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateChangeEventRequest(Consumer<UpdateChangeEventRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateChangeEventRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateChangeEventRequest(Consumer)} instead.
     * @param changeEvent changeEvent
     */
    @ApiStatus.Internal
    public UpdateChangeEventRequest(ChangeEvent changeEvent) {
        this.changeEvent = changeEvent;
    }

}
