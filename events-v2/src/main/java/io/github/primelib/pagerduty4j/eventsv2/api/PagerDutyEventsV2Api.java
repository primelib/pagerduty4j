package io.github.primelib.pagerduty4j.eventsv2.api;

import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.eventsv2.model.CreateChangeEvent202Response;
import io.github.primelib.pagerduty4j.eventsv2.model.CreateChangeEventRequest;
import io.github.primelib.pagerduty4j.eventsv2.model.CreateV2EventRequest;
import feign.RequestLine;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface PagerDutyEventsV2Api {

    /**
     * Send change events to the PagerDuty Events API
     * <p>
     * Change Events API enables you to send informational events about recent changes such as code deploys and system config changes from any system that can make an outbound HTTP connection. These events do not create incidents and do not send notifications; they are shown in context with incidents on the same PagerDuty service. 
     *
     * @param createChangeEventRequest  (required)
     */
    @RequestLine("POST /change/enqueue")
    @Headers({
        "Content-Type: application/json"
    })
    CreateChangeEvent202Response createChangeEvent(@NotNull CreateChangeEventRequest createChangeEventRequest);

    /**
     * Send an event to PagerDuty
     * <p>
     * Your monitoring tools should send PagerDuty a trigger event to report a new problem, or update an ongoing problem, depending on the event type. 
     *
     * @param createV2EventRequest  (required)
     */
    @RequestLine("POST /enqueue")
    @Headers({
        "Content-Type: application/json"
    })
    CreateChangeEvent202Response createV2Event(@NotNull CreateV2EventRequest createV2EventRequest);

}
