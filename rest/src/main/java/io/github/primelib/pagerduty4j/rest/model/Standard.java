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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Standard
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
    "active",
    "description",
    "id",
    "name",
    "type",
    "resource_type",
    "exclusions",
    "inclusions"
})
@JsonTypeName("Standard")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Standard {

    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("resource_type")
    protected ResourceTypeEnum resourceType;

    @JsonProperty("exclusions")
    protected List<StandardInclusionExclusion> exclusions;

    @JsonProperty("inclusions")
    protected List<StandardInclusionExclusion> inclusions;

    /**
     * Constructs a validated instance of {@link Standard}.
     *
     * @param spec the specification to process
     */
    public Standard(Consumer<Standard> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Standard}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Standard(Consumer)} instead.
     * @param active active
     * @param description description
     * @param id id
     * @param name name
     * @param type type
     * @param resourceType resourceType
     * @param exclusions exclusions
     * @param inclusions inclusions
     */
    @ApiStatus.Internal
    public Standard(Boolean active, String description, String id, String name, String type, ResourceTypeEnum resourceType, List<StandardInclusionExclusion> exclusions, List<StandardInclusionExclusion> inclusions) {
        this.active = active;
        this.description = description;
        this.id = id;
        this.name = name;
        this.type = type;
        this.resourceType = resourceType;
        this.exclusions = exclusions;
        this.inclusions = inclusions;
    }

    @AllArgsConstructor
    public enum ResourceTypeEnum {
        TECHNICAL_SERVICE("technical_service");

        private static final ResourceTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ResourceTypeEnum of(String input) {
            if (input != null) {
                for (ResourceTypeEnum v : VALUES) {
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
