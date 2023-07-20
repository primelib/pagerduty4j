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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentNoteRequestNote
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
    "content"
})
@JsonTypeName("createIncidentNote_request_note")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentNoteRequestNote {

    /**
     * The note content
     */
    @JsonProperty("content")
    protected String content;

    /**
     * Constructs a validated instance of {@link CreateIncidentNoteRequestNote}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentNoteRequestNote(Consumer<CreateIncidentNoteRequestNote> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentNoteRequestNote}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentNoteRequestNote(Consumer)} instead.
     * @param content The note content
     */
    @ApiStatus.Internal
    public CreateIncidentNoteRequestNote(String content) {
        this.content = content;
    }

}
