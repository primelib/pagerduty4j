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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MaintenanceWindow
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
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type;

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
     * This maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the {@code start_time}.
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
    protected List<ServiceReference> services;

    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * Constructs a validated instance of {@link MaintenanceWindow}.
     *
     * @param spec the specification to process
     */
    public MaintenanceWindow(Consumer<MaintenanceWindow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MaintenanceWindow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MaintenanceWindow(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type The type of object being created.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param sequenceNumber The order in which the maintenance window was created.
     * @param startTime This maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     * @param endTime This maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the {@code start_time}.
     * @param description A description for this maintenance window.
     * @param createdBy createdBy
     * @param services services
     * @param teams teams
     */
    @ApiStatus.Internal
    public MaintenanceWindow(String id, String summary, TypeEnum type, String self, String htmlUrl, Integer sequenceNumber, OffsetDateTime startTime, OffsetDateTime endTime, String description, UserReference createdBy, List<ServiceReference> services, List<TeamReference> teams) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.sequenceNumber = sequenceNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.createdBy = createdBy;
        this.services = services;
        this.teams = teams;
    }

    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MAINTENANCE_WINDOW("maintenance_window");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
