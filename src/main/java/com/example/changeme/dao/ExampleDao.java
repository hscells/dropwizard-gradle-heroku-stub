package com.example.changeme.dao;

import org.skife.jdbi.v2.sqlobject.SqlQuery;

/**
 * Created by Harry Scells on 26/02/2016.
 */
public interface ExampleDao {

    @SqlQuery("SELECT id FROM example")
    int example();

}
