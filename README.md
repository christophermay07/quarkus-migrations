# JBoss EAP 7.4.x QuickStarts to Quarkus Migration

Quarkus implementations of the [JBoss EAP 7.4.x Quick Starts](https://github.com/jboss-developer/jboss-eap-quickstarts/).

## Table of Contents
- [About](#about)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## About

This repository serves as a demonstration of migrating code originally designed for deployment on JBoss EAP 7.4.x to run on Quarkus. It's important to note that this is an illustrative example of migration rather than a complete rewrite. Consequently, some outdated / suboptimal coding practices will still be present in the codebase.

## Prerequisites

- **Maven 3.8+:** Preferrably use the latest Maven 3.x release. This has not been tested on the Maven 4 Alpha release.
- **JDK 11+:** Java 11 is the bare minimum version. As of the last README update, this has not been tested on JDK 17+, though it is expected to work on later versions.

## Usage

Each project will have its own README to discuss executing / testing the code.

## Contributing

Please reach out to chmay@redhat.com if you are interested in contributing. I'm writing many of these examples on my journey to become more familiar with Quarkus, so I welcome the opportunity to learn alternative / more effective migration approaches that I am unaware of!

I would ask that any contributor do their best to make atomic commits. The value of this repository lies less in the final result, and more in being able to trace the migration process commit by commit, from begin to end.

## License

Please see the [JBoss EAP 7.4.x Quick Starts license file](https://github.com/jboss-developer/jboss-eap-quickstarts/blob/7.4.x/LICENSE.txt).
