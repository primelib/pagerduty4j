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
 * ConferenceBridge
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
    "conference_number",
    "conference_url"
})
@JsonTypeName("ConferenceBridge")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConferenceBridge {

    /**
     * The phone number of the conference call for the conference bridge. Phone numbers should be formatted like +1 415-555-1212,,,,1234#, where a comma (,) represents a one-second wait and pound (#) completes access code input.
     */
    @JsonProperty("conference_number")
    protected String conferenceNumber;

    /**
     * An URL for the conference bridge. This could be a link to a web conference or Slack channel.
     */
    @JsonProperty("conference_url")
    protected String conferenceUrl;

    /**
     * Constructs a validated instance of {@link ConferenceBridge}.
     *
     * @param spec the specification to process
     */
    public ConferenceBridge(Consumer<ConferenceBridge> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConferenceBridge}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConferenceBridge(Consumer)} instead.
     * @param conferenceNumber The phone number of the conference call for the conference bridge. Phone numbers should be formatted like +1 415-555-1212,,,,1234#, where a comma (,) represents a one-second wait and pound (#) completes access code input.
     * @param conferenceUrl An URL for the conference bridge. This could be a link to a web conference or Slack channel.
     */
    @ApiStatus.Internal
    public ConferenceBridge(String conferenceNumber, String conferenceUrl) {
        this.conferenceNumber = conferenceNumber;
        this.conferenceUrl = conferenceUrl;
    }

}
