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
 * UpdateLogEntryChannelRequestChannel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "details",
    "type"
})
@JsonTypeName("updateLogEntryChannel_request_channel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateLogEntryChannelRequestChannel {

    /**
     * Constructs a validated implementation of {@link UpdateLogEntryChannelRequestChannel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateLogEntryChannelRequestChannel(Consumer<UpdateLogEntryChannelRequestChannel> spec) {
        spec.accept(this);
    }

    /**
     * New channel details
     */
    @JsonProperty("details")
    protected String details;

    /**
     * Channel type. Cannot be changed and must match the present value.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * Channel type. Cannot be changed and must match the present value.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        WEB_TRIGGER("web_trigger"),
        MOBILE("mobile");

        private final String value;
    }

}
