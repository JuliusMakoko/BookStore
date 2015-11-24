package model.backend.backend;
//import content.Context;


import model.backend.backend.Backend;

import javax.swing.text.AbstractDocument;

public final class BackendFactory {
    static Backend instance = null;
    public static String mode = "lists";

    public final static Backend getInstance(AbstractDocument.Content context) {
        if (mode == "lists") {
            if (instance == null)
                instance = new model.backend.DatabaseList();
            return instance;
        }
        if (mode == "sql") {
            if (instance == null)
                instance = new model.backend.DatabaseSqlite(context);
            return instance;
        }
        if (mode == "Service") {
            if (instance == null)
                instance = new model.datasource.DatabeseService();
            return instance;
        }
        else {
            return null;
        }
    }
}