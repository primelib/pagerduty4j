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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UserSession
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
    "user_id",
    "created_at",
    "type",
    "summary"
})
@JsonTypeName("UserSession")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserSession {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("user_id")
    protected String userId;

    /**
     * The date/time the user session was first created.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The type of the session
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The summary of the session
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * Constructs a validated instance of {@link UserSession}.
     *
     * @param spec the specification to process
     */
    public UserSession(Consumer<UserSession> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserSession}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserSession(Consumer)} instead.
     * @param id var.name
     * @param userId var.name
     * @param createdAt The date/time the user session was first created.
     * @param type The type of the session
     * @param summary The summary of the session
     */
    @ApiStatus.Internal
    public UserSession(String id, String userId, OffsetDateTime createdAt, TypeEnum type, String summary) {
        this.id = id;
        this.userId = userId;
        this.createdAt = createdAt;
        this.type = type;
        this.summary = summary;
    }

    /**
     * The type of the session
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BROWSER("browser"),
        OAUTH("oauth");

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
