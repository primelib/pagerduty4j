package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusUpdateTemplateInputStatusUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "message"
})
@JsonTypeName("StatusUpdateTemplateInput_status_update")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusUpdateTemplateInputStatusUpdate {

    /**
     * Constructs a validated implementation of {@link StatusUpdateTemplateInputStatusUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusUpdateTemplateInputStatusUpdate(Consumer<StatusUpdateTemplateInputStatusUpdate> spec) {
        spec.accept(this);
    }

    /**
     * An optional status update message that will be sent to the template
     */
    @JsonProperty("message")
    protected String message;


}
