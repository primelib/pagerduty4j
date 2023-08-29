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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduleOverride
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
    "start",
    "end",
    "user"
})
@JsonTypeName("ScheduleOverride")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduleOverride {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

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
     * The start date and time for the override.
     */
    @JsonProperty("start")
    protected OffsetDateTime start;

    /**
     * The end date and time for the override.
     */
    @JsonProperty("end")
    protected OffsetDateTime end;

    @JsonProperty("user")
    protected UserReference user;

    /**
     * Constructs a validated instance of {@link ScheduleOverride}.
     *
     * @param spec the specification to process
     */
    public ScheduleOverride(Consumer<ScheduleOverride> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScheduleOverride}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScheduleOverride(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param start The start date and time for the override.
     * @param end The end date and time for the override.
     * @param user user
     */
    @ApiStatus.Internal
    public ScheduleOverride(String id, String summary, String type, String self, String htmlUrl, OffsetDateTime start, OffsetDateTime end, UserReference user) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.start = start;
        this.end = end;
        this.user = user;
    }

}
