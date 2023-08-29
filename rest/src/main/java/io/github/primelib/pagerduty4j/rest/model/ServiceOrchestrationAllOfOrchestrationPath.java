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
 * ServiceOrchestrationAllOfOrchestrationPath
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
    "migrated_at",
    "migrated_by",
    "migrated_from",
    "migrated_status",
    "migrated_via",
    "type",
    "parent",
    "sets",
    "catch_all"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPath {

    /**
     * The date/time the service's Event Rules were converted to this Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @JsonProperty("migrated_at")
    protected OffsetDateTime migratedAt;

    @JsonProperty("migrated_by")
    protected ServiceOrchestrationAllOfOrchestrationPathAllOfMigratedBy migratedBy;

    @JsonProperty("migrated_from")
    protected ServiceOrchestrationAllOfOrchestrationPathAllOfMigratedFrom migratedFrom;

    /**
     * The status indicating whether the service's Event Rules were successfully converted to this Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @JsonProperty("migrated_status")
    protected MigratedStatusEnum migratedStatus;

    /**
     * Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @JsonProperty("migrated_via")
    protected MigratedViaEnum migratedVia;

    /**
     * Indicates that these are sets of rules belonging to a service.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("parent")
    protected ServiceOrchestrationAllOfOrchestrationPathAllOfParent parent;

    /**
     * A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    protected List<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner> sets;

    @JsonProperty("catch_all")
    protected ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAll catchAll;

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPath}.
     *
     * @param spec the specification to process
     */
    public ServiceOrchestrationAllOfOrchestrationPath(Consumer<ServiceOrchestrationAllOfOrchestrationPath> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPath}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceOrchestrationAllOfOrchestrationPath(Consumer)} instead.
     * @param migratedAt The date/time the service's Event Rules were converted to this Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     * @param migratedBy migratedBy
     * @param migratedFrom migratedFrom
     * @param migratedStatus The status indicating whether the service's Event Rules were successfully converted to this Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     * @param migratedVia Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the {@code migrated_metadata} query parameter is provided.
     * @param type Indicates that these are sets of rules belonging to a service.
     * @param parent parent
     * @param sets A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * @param catchAll catchAll
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPath(OffsetDateTime migratedAt, ServiceOrchestrationAllOfOrchestrationPathAllOfMigratedBy migratedBy, ServiceOrchestrationAllOfOrchestrationPathAllOfMigratedFrom migratedFrom, MigratedStatusEnum migratedStatus, MigratedViaEnum migratedVia, String type, ServiceOrchestrationAllOfOrchestrationPathAllOfParent parent, List<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner> sets, ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAll catchAll) {
        this.migratedAt = migratedAt;
        this.migratedBy = migratedBy;
        this.migratedFrom = migratedFrom;
        this.migratedStatus = migratedStatus;
        this.migratedVia = migratedVia;
        this.type = type;
        this.parent = parent;
        this.sets = sets;
        this.catchAll = catchAll;
    }

    /**
     * The status indicating whether the service's Event Rules were successfully converted to this Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @AllArgsConstructor
    public enum MigratedStatusEnum {
        COMPLETED("completed");

        private static final MigratedStatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static MigratedStatusEnum of(String input) {
            if (input != null) {
                for (MigratedStatusEnum v : VALUES) {
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

    /**
     * Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @AllArgsConstructor
    public enum MigratedViaEnum {
        API("API"),
        UI("UI");

        private static final MigratedViaEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static MigratedViaEnum of(String input) {
            if (input != null) {
                for (MigratedViaEnum v : VALUES) {
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
