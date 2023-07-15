package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentNoteRequestNote
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "content"
})
@JsonTypeName("createIncidentNote_request_note")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentNoteRequestNote {

    /**
     * Constructs a validated implementation of {@link CreateIncidentNoteRequestNote}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentNoteRequestNote(Consumer<CreateIncidentNoteRequestNote> spec) {
        spec.accept(this);
    }

    /**
     * The note content
     */
    @JsonProperty("content")
    protected String content;


}
