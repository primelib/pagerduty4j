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
 * StatusPagePost
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
    "type",
    "post_type",
    "status_page",
    "linked_resource",
    "postmortem",
    "title",
    "starts_at",
    "ends_at",
    "updates"
})
@JsonTypeName("StatusPagePost")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePost {

    /**
     * An unique identifier within Status Page scope that defines a single Post resource.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The API resource URL of the Post.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The type of the object returned by the API - in this case, a Status Page Post.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The type of post to retrieve Impacts for.
     */
    @JsonProperty("post_type")
    protected PostTypeEnum postType;

    @JsonProperty("status_page")
    protected StatusPageImpactStatusPage statusPage;

    @JsonProperty("linked_resource")
    protected StatusPagePostLinkedResource linkedResource;

    @JsonProperty("postmortem")
    protected StatusPagePostPostmortem postmortem;

    /**
     * The title given to a Post.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The date and time the Post intent becomes effective - only for maintenance post type.
     */
    @JsonProperty("starts_at")
    protected OffsetDateTime startsAt;

    /**
     * The date and time the Post intent is concluded - only for maintenance post type.
     */
    @JsonProperty("ends_at")
    protected OffsetDateTime endsAt;

    /**
     * List of status_page_post_update references associated to a Post.
     */
    @JsonProperty("updates")
    protected List<StatusPagePostUpdatesInner> updates;

    /**
     * Constructs a validated instance of {@link StatusPagePost}.
     *
     * @param spec the specification to process
     */
    public StatusPagePost(Consumer<StatusPagePost> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePost}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePost(Consumer)} instead.
     * @param id An unique identifier within Status Page scope that defines a single Post resource.
     * @param self The API resource URL of the Post.
     * @param type The type of the object returned by the API - in this case, a Status Page Post.
     * @param postType The type of post to retrieve Impacts for.
     * @param statusPage statusPage
     * @param linkedResource linkedResource
     * @param postmortem postmortem
     * @param title The title given to a Post.
     * @param startsAt The date and time the Post intent becomes effective - only for maintenance post type.
     * @param endsAt The date and time the Post intent is concluded - only for maintenance post type.
     * @param updates List of status_page_post_update references associated to a Post.
     */
    @ApiStatus.Internal
    public StatusPagePost(String id, String self, String type, PostTypeEnum postType, StatusPageImpactStatusPage statusPage, StatusPagePostLinkedResource linkedResource, StatusPagePostPostmortem postmortem, String title, OffsetDateTime startsAt, OffsetDateTime endsAt, List<StatusPagePostUpdatesInner> updates) {
        this.id = id;
        this.self = self;
        this.type = type;
        this.postType = postType;
        this.statusPage = statusPage;
        this.linkedResource = linkedResource;
        this.postmortem = postmortem;
        this.title = title;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.updates = updates;
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
