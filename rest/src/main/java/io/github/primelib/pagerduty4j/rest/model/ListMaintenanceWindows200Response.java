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
 * ListMaintenanceWindows200Response
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
    "offset",
    "limit",
    "more",
    "total",
    "maintenance_windows"
})
@JsonTypeName("listMaintenanceWindows_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListMaintenanceWindows200Response {

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

    @JsonProperty("maintenance_windows")
    protected List<MaintenanceWindow> maintenanceWindows;

    /**
     * Constructs a validated instance of {@link ListMaintenanceWindows200Response}.
     *
     * @param spec the specification to process
     */
    public ListMaintenanceWindows200Response(Consumer<ListMaintenanceWindows200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListMaintenanceWindows200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListMaintenanceWindows200Response(Consumer)} instead.
     * @param offset Echoes offset pagination property.
     * @param limit Echoes limit pagination property.
     * @param more Indicates if there are additional records to return
     * @param total The total number of records matching the given query.
     * @param maintenanceWindows maintenanceWindows
     */
    @ApiStatus.Internal
    public ListMaintenanceWindows200Response(Integer offset, Integer limit, Boolean more, Integer total, List<MaintenanceWindow> maintenanceWindows) {
        this.offset = offset;
        this.limit = limit;
        this.more = more;
        this.total = total;
        this.maintenanceWindows = maintenanceWindows;
    }

}
