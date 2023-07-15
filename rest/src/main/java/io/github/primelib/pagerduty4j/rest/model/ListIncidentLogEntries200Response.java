package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListIncidentLogEntries200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "offset",
    "limit",
    "more",
    "total",
    "log_entries"
})
@JsonTypeName("listIncidentLogEntries_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentLogEntries200Response {

    /**
     * Constructs a validated implementation of {@link ListIncidentLogEntries200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListIncidentLogEntries200Response(Consumer<ListIncidentLogEntries200Response> spec) {
        spec.accept(this);
    }

    /**
     * Echoes offset pagination property.
     */
    @JsonProperty("offset")
    protected Integer offset;

    /**
     * Echoes limit pagination property.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * Indicates if there are additional records to return
     */
    @JsonProperty("more")
    protected Boolean more;

    /**
     * The total number of records matching the given query.
     */
    @JsonProperty("total")
    protected Integer total;

    @JsonProperty("log_entries")
    protected List<ListIncidentLogEntries200ResponseAllOfLogEntriesInner> logEntries = new ArrayList<>();


}
