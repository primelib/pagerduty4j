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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListIncidentNotes200Response
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
    "notes"
})
@JsonTypeName("listIncidentNotes_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentNotes200Response {

    @JsonProperty("notes")
    protected List<IncidentNote> notes;

    /**
     * Constructs a validated instance of {@link ListIncidentNotes200Response}.
     *
     * @param spec the specification to process
     */
    public ListIncidentNotes200Response(Consumer<ListIncidentNotes200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListIncidentNotes200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListIncidentNotes200Response(Consumer)} instead.
     * @param notes notes
     */
    @ApiStatus.Internal
    public ListIncidentNotes200Response(List<IncidentNote> notes) {
        this.notes = notes;
    }

}
