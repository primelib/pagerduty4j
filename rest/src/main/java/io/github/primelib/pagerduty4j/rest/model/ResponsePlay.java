package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponsePlay
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "name",
    "description",
    "team",
    "subscribers",
    "subscribers_message",
    "responders",
    "responders_message",
    "runnability",
    "conference_number",
    "conference_url",
    "conference_type"
})
@JsonTypeName("ResponsePlay")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponsePlay {

    /**
     * Constructs a validated implementation of {@link ResponsePlay}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResponsePlay(Consumer<ResponsePlay> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.RESPONSE_PLAY;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The name of the response play.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The description of the response play.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("team")
    protected ResponsePlayAllOfTeam team;

    /**
     * An array containing the users and/or teams to be added as subscribers to any incident on which this response play is run.
     */
    @JsonProperty("subscribers")
    protected List<ResponsePlayAllOfSubscribersInner> subscribers;

    /**
     * The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     */
    @JsonProperty("subscribers_message")
    protected String subscribersMessage;

    /**
     * An array containing the users and/or escalation policies to be requested as responders to any incident on which this response play is run.
     */
    @JsonProperty("responders")
    protected List<ResponsePlayAllOfRespondersInner> responders;

    /**
     * The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
     */
    @JsonProperty("responders_message")
    protected String respondersMessage;

    /**
     * String representing how this response play is allowed to be run. Valid options are:
     *  - `services`: This response play cannot be manually run by any users. It will run automatically for new incidents triggered on any services that are configured with this response play.
     *  - `teams`: This response play can be run manually on an incident only by members of its configured team. This option can only be selected when the `team` property for this response play is not empty.
     *  - `responders`: This response play can be run manually on an incident by any responders in this account.
     */
    @JsonProperty("runnability")
    protected RunnabilityEnum runnability = RunnabilityEnum.SERVICES;

    /**
     * The telephone number that will be set as the conference number for any incident on which this response play is run.
     */
    @JsonProperty("conference_number")
    protected String conferenceNumber;

    /**
     * The URL that will be set as the conference URL for any incident on which this response play is run.
     */
    @JsonProperty("conference_url")
    protected String conferenceUrl;

    /**
     * This field has three possible values and indicates how the response play was created.
     *  - `none` : The response play had no conference_number or conference_url set at time of creation.
     *  - `manual` : The response play had one or both of conference_number and conference_url set at time of creation.
     *  - `zoom` : Customers with the Zoom-Integration Entitelment can use this value to dynamicly configure conference number and url for zoom
     */
    @JsonProperty("conference_type")
    protected ConferenceTypeEnum conferenceType = ConferenceTypeEnum.NONE;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        RESPONSE_PLAY("response_play");

        private final String value;
    }

    /**
     * String representing how this response play is allowed to be run. Valid options are:
     *  - `services`: This response play cannot be manually run by any users. It will run automatically for new incidents triggered on any services that are configured with this response play.
     *  - `teams`: This response play can be run manually on an incident only by members of its configured team. This option can only be selected when the `team` property for this response play is not empty.
     *  - `responders`: This response play can be run manually on an incident by any responders in this account.
     */
    @AllArgsConstructor
    public enum RunnabilityEnum {
        SERVICES("services"),
        TEAMS("teams"),
        RESPONDERS("responders");

        private final String value;
    }

    /**
     * This field has three possible values and indicates how the response play was created.
     *  - `none` : The response play had no conference_number or conference_url set at time of creation.
     *  - `manual` : The response play had one or both of conference_number and conference_url set at time of creation.
     *  - `zoom` : Customers with the Zoom-Integration Entitelment can use this value to dynamicly configure conference number and url for zoom
     */
    @AllArgsConstructor
    public enum ConferenceTypeEnum {
        NONE("none"),
        MANUAL("manual"),
        ZOOM("zoom");

        private final String value;
    }

}
