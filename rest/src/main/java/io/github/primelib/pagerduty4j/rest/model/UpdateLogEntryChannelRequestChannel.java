package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLogEntryChannelRequestChannel
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "details",
    "type"
})
@JsonTypeName("updateLogEntryChannel_request_channel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateLogEntryChannelRequestChannel {

    /**
     * New channel details
     */
    @JsonProperty("details")
    private String details;

    /**
     * Channel type. Cannot be changed and must match the present value.
     */
    @JsonProperty("type")
    private TypeEnum type;


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
