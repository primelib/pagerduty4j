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
 * StandardApplied
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
    "resource_id",
    "resource_type",
    "score",
    "standards"
})
@JsonTypeName("StandardApplied")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StandardApplied {

    @JsonProperty("resource_id")
    protected String resourceId;

    @JsonProperty("resource_type")
    protected ResourceTypeEnum resourceType;

    @JsonProperty("score")
    protected StandardAppliedScore score;

    @JsonProperty("standards")
    protected List<StandardAppliedStandardsInner> standards;

    /**
     * Constructs a validated instance of {@link StandardApplied}.
     *
     * @param spec the specification to process
     */
    public StandardApplied(Consumer<StandardApplied> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StandardApplied}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StandardApplied(Consumer)} instead.
     * @param resourceId resourceId
     * @param resourceType resourceType
     * @param score score
     * @param standards standards
     */
    @ApiStatus.Internal
    public StandardApplied(String resourceId, ResourceTypeEnum resourceType, StandardAppliedScore score, List<StandardAppliedStandardsInner> standards) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.score = score;
        this.standards = standards;
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
