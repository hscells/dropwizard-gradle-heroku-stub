package com.example.changeme;

import com.example.changeme.dao.ExampleDao;
import com.example.changeme.resources.ExampleViewResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.skife.jdbi.v2.DBI;

/**
 * Created by Harry Scells on 26/02/2016.
 */
public class ServerApplication extends Application<ServerConfiguration> {

    @Override
    public void run(ServerConfiguration configuration, Environment environment){

        // comment the following two lines out if a database is not needed
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");

        final ExampleDao exampleDao = jdbi.onDemand(ExampleDao.class);

        environment.jersey().register(new ExampleViewResource());

    }

    public static void main(String[] args) throws Exception {
        new ServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "databaseapp";
    }

    @Override
    public void initialize(Bootstrap<ServerConfiguration> bootstrap) {

        bootstrap.addBundle(new AssetsBundle("/static", "/static", "*"));

        // uncomment this to serve files locally and comment the above line
        // bootstrap.addBundle(new FileAssetsBundle("src/main/resources/static", "/static", "*"));

        bootstrap.addBundle(new ViewBundle<>());
    }

}
