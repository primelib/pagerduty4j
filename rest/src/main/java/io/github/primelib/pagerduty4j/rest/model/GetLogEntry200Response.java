package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetLogEntry200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "log_entry"
})
@JsonTypeName("getLogEntry_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetLogEntry200Response {

    @JsonProperty("log_entry")
    private ListIncidentLogEntries200ResponseAllOfLogEntriesInner logEntry;


}
