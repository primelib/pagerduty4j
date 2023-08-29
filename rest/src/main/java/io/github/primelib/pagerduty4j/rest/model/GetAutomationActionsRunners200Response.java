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
 * GetAutomationActionsRunners200Response
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
    "limit",
    "next_cursor",
    "runners",
    "privileges"
})
@JsonTypeName("getAutomationActionsRunners_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAutomationActionsRunners200Response {

    /**
     * The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * An opaque string than will deliver the next set of results when provided as the {@code cursor} parameter in a subsequent request.
     * A {@code null} value for this field indicates that there are no additional results. 
     */
    @JsonProperty("next_cursor")
    protected String nextCursor;

    @JsonProperty("runners")
    protected List<AutomationActionsRunner> runners;

    @JsonProperty("privileges")
    protected AutomationActionsUserPermissions privileges;

    /**
     * Constructs a validated instance of {@link GetAutomationActionsRunners200Response}.
     *
     * @param spec the specification to process
     */
    public GetAutomationActionsRunners200Response(Consumer<GetAutomationActionsRunners200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAutomationActionsRunners200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAutomationActionsRunners200Response(Consumer)} instead.
     * @param limit The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param nextCursor An opaque string than will deliver the next set of results when provided as the {@code cursor} parameter in a subsequent request.  A {@code null} value for this field indicates that there are no additional results. 
     * @param runners runners
     * @param privileges privileges
     */
    @ApiStatus.Internal
    public GetAutomationActionsRunners200Response(Integer limit, String nextCursor, List<AutomationActionsRunner> runners, AutomationActionsUserPermissions privileges) {
        this.limit = limit;
        this.nextCursor = nextCursor;
        this.runners = runners;
        this.privileges = privileges;
    }

}
