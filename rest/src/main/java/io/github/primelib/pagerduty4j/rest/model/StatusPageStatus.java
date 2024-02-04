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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * StatusPageStatus
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
    "self",
    "description",
    "post_type",
    "status_page",
    "type"
})
@JsonTypeName("StatusPageStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPageStatus {

    /**
     * An unique identifier within Status Page scope that defines a Status entry.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The API resource URL of the Status.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The description is a human-readable text that describes the Status level.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The type of post to retrieve Impacts for.
     */
    @JsonProperty("post_type")
    protected PostTypeEnum postType;

    @JsonProperty("status_page")
    protected StatusPageImpactStatusPage statusPage;

    /**
     * The type of the object returned by the API - in this case, a Status Page Status.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPageStatus}.
     *
     * @param spec the specification to process
     */
    public StatusPageStatus(Consumer<StatusPageStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPageStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPageStatus(Consumer)} instead.
     * @param id An unique identifier within Status Page scope that defines a Status entry.
     * @param self The API resource URL of the Status.
     * @param description The description is a human-readable text that describes the Status level.
     * @param postType The type of post to retrieve Impacts for.
     * @param statusPage statusPage
     * @param type The type of the object returned by the API - in this case, a Status Page Status.
     */
    @ApiStatus.Internal
    public StatusPageStatus(String id, String self, String description, PostTypeEnum postType, StatusPageImpactStatusPage statusPage, String type) {
        this.id = id;
        this.self = self;
        this.description = description;
        this.postType = postType;
        this.statusPage = statusPage;
        this.type = type;
    }

    /**
     * The type of post to retrieve Impacts for.
     */
    @AllArgsConstructor
    public enum PostTypeEnum {
        INCIDENT("incident"),
        MAINTENANCE("maintenance");

        private static final PostTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PostTypeEnum of(String input) {
            if (input != null) {
                for (PostTypeEnum v : VALUES) {
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
