package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.MAINTENANCE_WINDOW;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The order in which the maintenance window was created.
     */
    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    /**
     * This maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     */
    @JsonProperty("start_time")
    private OffsetDateTime startTime;

    /**
     * This maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
     */
    @JsonProperty("end_time")
    private OffsetDateTime endTime;

    /**
     * A description for this maintenance window.
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("created_by")
    private UserReference createdBy;

    @JsonProperty("services")
    private List<ServiceReference> services = new ArrayList<>();

    @JsonProperty("teams")
    private List<TeamReference> teams;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MAINTENANCE_WINDOW("maintenance_window");

        private final String value;
    }

}
