package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MaintenanceWindow
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "sequence_number",
    "start_time",
    "end_time",
    "description",
    "created_by",
    "services",
    "teams"
})
@JsonTypeName("MaintenanceWindow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MaintenanceWindow {

    /**
     * Constructs a validated implementation of {@link MaintenanceWindow}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MaintenanceWindow(Consumer<MaintenanceWindow> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.MAINTENANCE_WINDOW;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The order in which the maintenance window was created.
     */
    @JsonProperty("sequence_number")
    protected Integer sequenceNumber;

    /**
     * This maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     */
    @JsonProperty("start_time")
    protected OffsetDateTime startTime;

    /**
     * This maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
     */
    @JsonProperty("end_time")
    protected OffsetDateTime endTime;

    /**
     * A description for this maintenance window.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("created_by")
    protected UserReference createdBy;

    @JsonProperty("services")
    protected List<ServiceReference> services = new ArrayList<>();

    @JsonProperty("teams")
    protected List<TeamReference> teams;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MAINTENANCE_WINDOW("maintenance_window");

        private final String value;
    }

}
