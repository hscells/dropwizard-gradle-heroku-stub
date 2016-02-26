package com.example.changeme.views;

import io.dropwizard.views.View;

/**
 * Created by Harry Scells on 26/02/2016.
 */
public class ExampleView extends View {

    public ExampleView() {
        super("/views/Example.mustache");
    }

}
