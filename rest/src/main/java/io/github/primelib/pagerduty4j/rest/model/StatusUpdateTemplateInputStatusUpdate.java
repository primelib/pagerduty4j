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
 * StatusUpdateTemplateInputStatusUpdate
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
    "message"
})
@JsonTypeName("StatusUpdateTemplateInput_status_update")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusUpdateTemplateInputStatusUpdate {

    /**
     * An optional status update message that will be sent to the template
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link StatusUpdateTemplateInputStatusUpdate}.
     *
     * @param spec the specification to process
     */
    public StatusUpdateTemplateInputStatusUpdate(Consumer<StatusUpdateTemplateInputStatusUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusUpdateTemplateInputStatusUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusUpdateTemplateInputStatusUpdate(Consumer)} instead.
     * @param message An optional status update message that will be sent to the template
     */
    @ApiStatus.Internal
    public StatusUpdateTemplateInputStatusUpdate(String message) {
        this.message = message;
    }

}
