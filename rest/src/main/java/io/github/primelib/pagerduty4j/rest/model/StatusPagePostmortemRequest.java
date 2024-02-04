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
 * StatusPagePostmortemRequest
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
    "post",
    "message",
    "notify_subscribers"
})
@JsonTypeName("StatusPagePostmortemRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePostmortemRequest {

    /**
     * The type of the object returned by the API - in this case, a Status Page Post Postmortem.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("post")
    protected StatusPagePostUpdatePost post;

    /**
     * The message of the Postmortem (supports Rich-Text).
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Whether or not subscribers of the Status Page should be notified about the Postmortem.
     */
    @JsonProperty("notify_subscribers")
    protected Boolean notifySubscribers;

    /**
     * Constructs a validated instance of {@link StatusPagePostmortemRequest}.
     *
     * @param spec the specification to process
     */
    public StatusPagePostmortemRequest(Consumer<StatusPagePostmortemRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePostmortemRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePostmortemRequest(Consumer)} instead.
     * @param type The type of the object returned by the API - in this case, a Status Page Post Postmortem.
     * @param post post
     * @param message The message of the Postmortem (supports Rich-Text).
     * @param notifySubscribers Whether or not subscribers of the Status Page should be notified about the Postmortem.
     */
    @ApiStatus.Internal
    public StatusPagePostmortemRequest(TypeEnum type, StatusPagePostUpdatePost post, String message, Boolean notifySubscribers) {
        this.type = type;
        this.post = post;
        this.message = message;
        this.notifySubscribers = notifySubscribers;
    }

    /**
     * The type of the object returned by the API - in this case, a Status Page Post Postmortem.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        STATUS_PAGE_POST_POSTMORTEM("status_page_post_postmortem");

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
