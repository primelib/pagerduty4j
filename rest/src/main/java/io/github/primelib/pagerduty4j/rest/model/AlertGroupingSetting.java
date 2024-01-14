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
 * AlertGroupingSetting
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
    "name",
    "description",
    "type",
    "config",
    "services",
    "created_at",
    "updated_at"
})
@JsonTypeName("AlertGroupingSetting")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertGroupingSetting {

    @JsonProperty("id")
    protected String id;

    /**
     * An optional short-form string that provides succinct information about an AlertGroupingSetting object suitable for primary labeling of the entity. It is not intended to be an identifier.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * An optional description in string that provides more information about an AlertGroupingSetting object.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("config")
    protected ContentBasedAlertGroupingConfiguration config;

    /**
     * The array of one or many Services with just ServiceID/name that the AlertGroupingSetting applies to.
     */
    @JsonProperty("services")
    protected List<ServiceReference> services;

    /**
     * The ISO8601 date/time an AlertGroupingSetting got created at.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The ISO8601 date/time an AlertGroupingSetting last got updated at.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    /**
     * Constructs a validated instance of {@link AlertGroupingSetting}.
     *
     * @param spec the specification to process
     */
    public AlertGroupingSetting(Consumer<AlertGroupingSetting> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertGroupingSetting}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertGroupingSetting(Consumer)} instead.
     * @param id id
     * @param name An optional short-form string that provides succinct information about an AlertGroupingSetting object suitable for primary labeling of the entity. It is not intended to be an identifier.
     * @param description An optional description in string that provides more information about an AlertGroupingSetting object.
     * @param type type
     * @param config config
     * @param services The array of one or many Services with just ServiceID/name that the AlertGroupingSetting applies to.
     * @param createdAt The ISO8601 date/time an AlertGroupingSetting got created at.
     * @param updatedAt The ISO8601 date/time an AlertGroupingSetting last got updated at.
     */
    @ApiStatus.Internal
    public AlertGroupingSetting(String id, String name, String description, TypeEnum type, ContentBasedAlertGroupingConfiguration config, List<ServiceReference> services, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.config = config;
        this.services = services;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        CONTENT_BASED("content_based");

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
