package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserSession
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link UserSession}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserSession(Consumer<UserSession> spec) {
        spec.accept(this);
    }

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
     * The type of the session
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BROWSER("browser"),
        OAUTH("oauth");

        private final String value;
    }

}
