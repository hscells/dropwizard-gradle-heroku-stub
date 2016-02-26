# Dropwizard Gradle Heroku Stub

Start developing a dropwizard application built using gradle and deployed to heroku with this stub.

## What's included

 - A `build.gradle` file with pretty much everything needed, including drivers for mysql and postgres
 - A build script for gradle that compiles the correct files
 - A Procfile that will run the app on the heroku port automatically
 - A dropwizard `configuration.yml` file with a template for database interaction
 - Template files for a DAO and a View
 - A configured [library](https://github.com/dirkraft/dropwizard-file-assets) for serving static files locally

## Building

Standard `gradle installAll`