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
 * ListServiceEventRules200Response
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
    "migrated_at",
    "migrated_by",
    "migrated_status",
    "migrated_to",
    "migrated_via",
    "rules"
})
@JsonTypeName("listServiceEventRules_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListServiceEventRules200Response {

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

    /**
     * The date/time the service's Event Rules were converted to a Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @JsonProperty("migrated_at")
    protected OffsetDateTime migratedAt;

    @JsonProperty("migrated_by")
    protected ListServiceEventRules200ResponseAllOfMigratedBy migratedBy;

    /**
     * The status indicating whether the service's Event Rules were successfully converted to a Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @JsonProperty("migrated_status")
    protected MigratedStatusEnum migratedStatus;

    @JsonProperty("migrated_to")
    protected ListServiceEventRules200ResponseAllOfMigratedTo migratedTo;

    /**
     * Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the {@code migrated_metadata} query parameter is provided.
     */
    @JsonProperty("migrated_via")
    protected MigratedViaEnum migratedVia;

    /**
     * The paginated list of Event Rules of the Service.
     */
    @JsonProperty("rules")
    protected List<ServiceEventRule> rules;

    /**
     * Constructs a validated instance of {@link ListServiceEventRules200Response}.
     *
     * @param spec the specification to process
     */
    public ListServiceEventRules200Response(Consumer<ListServiceEventRules200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListServiceEventRules200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListServiceEventRules200Response(Consumer)} instead.
     * @param offset Echoes offset pagination property.
     * @param limit Echoes limit pagination property.
     * @param more Indicates if there are additional records to return
     * @param total The total number of records matching the given query.
     * @param migratedAt The date/time the service's Event Rules were converted to a Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     * @param migratedBy migratedBy
     * @param migratedStatus The status indicating whether the service's Event Rules were successfully converted to a Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
     * @param migratedTo migratedTo
     * @param migratedVia Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the {@code migrated_metadata} query parameter is provided.
     * @param rules The paginated list of Event Rules of the Service.
     */
    @ApiStatus.Internal
    public ListServiceEventRules200Response(Integer offset, Integer limit, Boolean more, Integer total, OffsetDateTime migratedAt, ListServiceEventRules200ResponseAllOfMigratedBy migratedBy, MigratedStatusEnum migratedStatus, ListServiceEventRules200ResponseAllOfMigratedTo migratedTo, MigratedViaEnum migratedVia, List<ServiceEventRule> rules) {
        this.offset = offset;
        this.limit = limit;
        this.more = more;
        this.total = total;
        this.migratedAt = migratedAt;
        this.migratedBy = migratedBy;
        this.migratedStatus = migratedStatus;
        this.migratedTo = migratedTo;
        this.migratedVia = migratedVia;
        this.rules = rules;
    }

    /**
     * The status indicating whether the service's Event Rules were successfully converted to a Service Orchestration. This property is only included if the {@code migrated_metadata} query parameter is provided.
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
