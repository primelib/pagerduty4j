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
 * IncidentNote
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
    "user",
    "channel",
    "content",
    "created_at"
})
@JsonTypeName("IncidentNote")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentNote {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("user")
    protected IncidentNoteUser user;

    @JsonProperty("channel")
    protected IncidentNoteChannel channel;

    /**
     * The note content
     */
    @JsonProperty("content")
    protected String content;

    /**
     * The time at which the note was submitted
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * Constructs a validated instance of {@link IncidentNote}.
     *
     * @param spec the specification to process
     */
    public IncidentNote(Consumer<IncidentNote> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentNote}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentNote(Consumer)} instead.
     * @param id var.name
     * @param user var.name
     * @param channel var.name
     * @param content The note content
     * @param createdAt The time at which the note was submitted
     */
    @ApiStatus.Internal
    public IncidentNote(String id, IncidentNoteUser user, IncidentNoteChannel channel, String content, OffsetDateTime createdAt) {
        this.id = id;
        this.user = user;
        this.channel = channel;
        this.content = content;
        this.createdAt = createdAt;
    }

}
