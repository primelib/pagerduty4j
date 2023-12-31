# *PagerDuty4J*

> A java client for the PagerDuty APIs.

## Module: REST

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/pagerduty4j-rest)](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-rest)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/pagerduty4j-rest/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/pagerduty4j-rest)

### Installation

```gradle
implementation("io.github.primelib:pagerduty4j-rest:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-rest).

### Usage

*Consumer Specification Approach*

```java
PagerDutyRESTConsumerApi client = PagerDutyRESTFactory.create(spec -> {
    spec.api(PagerDutyRESTConsumerApi.class);
    spec.baseUrl("https://api.pagerduty.com");
    spec.apiKeyAuth(authSpec -> authSpec.apiKey("<token>"));
    // optional: http proxy
    spec.httpProxy(proxySpec -> {
        proxySpec.host("localhost");
        proxySpec.port(8080);
    });
});

client.listIncidentAlerts(spec -> {
    spec.id("15");
    spec.limit(100);
});
```

*Parameter Approach*

```java
PagerDutyRESTApi client = PagerDutyRESTFactory.create(spec -> {
    spec.api(PagerDutyRESTApi.class);
    spec.baseUrl("https://api.pagerduty.com");
    spec.apiKeyAuth(authSpec -> authSpec.apiKey("<token>"));
    // optional: http proxy
    spec.httpProxy(proxySpec -> {
        proxySpec.host("localhost");
        proxySpec.port(8080);
    });
});

client.listIncidentAlerts("15", 100, null, null, null, null, null, null);
```

**_NOTE:_** The `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Module: Events-V2

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/pagerduty4j-events-v2)](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-events-v2)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/pagerduty4j-events-v2/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/pagerduty4j-events-v2)


### Installation

```gradle
implementation("io.github.primelib:pagerduty4j-events-v2:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-events-v2).

### Usage

*Consumer Specification Approach*

```java
PagerDutyEventsV2ConsumerApi client = PagerDutyEventsV2Factory.create(spec -> {
    spec.api(PagerDutyEventsV2ConsumerApi.class);
    spec.baseUrl("https://events.pagerduty.com/v2");
    // optional: http proxy
    spec.httpProxy(proxySpec -> {
        proxySpec.host("localhost");
        proxySpec.port(8080);
    });
});

client.createChangeEvent(spec -> {
    spec.createChangeEventRequest(CreateChangeEventRequest.of(requestSpec -> {
        requestSpec.routingKey("<routingKey>");
        requestSpec.payload(ChangeEventPayload.of(payloadSpec -> {
            payloadSpec.summary("<summary>");
            payloadSpec.source("<source>");
        }));
    }));
});
```

*Parameter Approach*

```java
PagerDutyEventsV2Api client = PagerDutyEventsV2Factory.create(spec -> {
    spec.api(PagerDutyEventsV2Api.class);
    spec.baseUrl("https://events.pagerduty.com/v2");
    // optional: http proxy
    spec.httpProxy(proxySpec -> {
        proxySpec.host("localhost");
        proxySpec.port(8080);
    });
});

client.createChangeEvent(new CreateChangeEventRequest(new ChangeEventPayload("<summary>", null, "<source>", null), "<routingKey>", null, null));
```

**_NOTE:_** The `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Links

- [Documentation](https://primelib.github.io)
- [Contribute](https://primelib.github.io/contribution/)

## License

Released under the [MIT License](./LICENSE).
