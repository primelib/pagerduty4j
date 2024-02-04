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
 * StatusPagePostPutRequest
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
    "type",
    "title",
    "post_type",
    "starts_at",
    "ends_at",
    "updates",
    "status_page"
})
@JsonTypeName("StatusPagePostPutRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePostPutRequest {

    /**
     * The type of the object returned by the API - in this case, a Status Page Post.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The title given to a Post.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The type of post to retrieve Impacts for.
     */
    @JsonProperty("post_type")
    protected PostTypeEnum postType;

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
     * Post Updates to be associated with a Post
     */
    @JsonProperty("updates")
    protected List<StatusPagePostUpdateRequest> updates;

    @JsonProperty("status_page")
    protected StatusPageImpactStatusPage statusPage;

    /**
     * Constructs a validated instance of {@link StatusPagePostPutRequest}.
     *
     * @param spec the specification to process
     */
    public StatusPagePostPutRequest(Consumer<StatusPagePostPutRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePostPutRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePostPutRequest(Consumer)} instead.
     * @param type The type of the object returned by the API - in this case, a Status Page Post.
     * @param title The title given to a Post.
     * @param postType The type of post to retrieve Impacts for.
     * @param startsAt The date and time the Post intent becomes effective - only for maintenance post type.
     * @param endsAt The date and time the Post intent is concluded - only for maintenance post type.
     * @param updates Post Updates to be associated with a Post
     * @param statusPage statusPage
     */
    @ApiStatus.Internal
    public StatusPagePostPutRequest(TypeEnum type, String title, PostTypeEnum postType, OffsetDateTime startsAt, OffsetDateTime endsAt, List<StatusPagePostUpdateRequest> updates, StatusPageImpactStatusPage statusPage) {
        this.type = type;
        this.title = title;
        this.postType = postType;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.updates = updates;
        this.statusPage = statusPage;
    }

    /**
     * The type of the object returned by the API - in this case, a Status Page Post.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        STATUS_PAGE_POST("status_page_post");

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
