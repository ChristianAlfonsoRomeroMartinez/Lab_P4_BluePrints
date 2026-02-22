package edu.eci.arsw.blueprints.persistence;

import java.util.Set;

import edu.eci.arsw.blueprints.model.Blueprint;

public interface BlueprintPersistence {

    void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException;

    Blueprint getBlueprint(String author, String name) throws BlueprintNotFoundException;

    Set<Blueprint> getBlueprintsByAuthor(String author) throws BlueprintNotFoundException;

    Set<Blueprint> getAllBlueprints();

    void addPoint(String author, String name, int x, int y) throws BlueprintNotFoundException;

    //Elimina un blueprint, tenemos el delete cascade por lo que se eliminan los otros puntos
    void deleteBlueprint(String author, String name) throws BlueprintNotFoundException;
}
