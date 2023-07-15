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
 * UpdateLogEntryChannelRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "channel"
})
@JsonTypeName("updateLogEntryChannel_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateLogEntryChannelRequest {

    /**
     * Constructs a validated implementation of {@link UpdateLogEntryChannelRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateLogEntryChannelRequest(Consumer<UpdateLogEntryChannelRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("channel")
    protected UpdateLogEntryChannelRequestChannel channel;


}
