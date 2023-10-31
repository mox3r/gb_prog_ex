package Task1;

public class Entity implements PersonalData {

    /**
     * Организация
     */

    private String entityName;
    private String inn;

    public String getEntityName() {
        return entityName;
    }

    public Entity(String entityName, String inn) {
        this.entityName = entityName;
        this.inn = inn;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s; INN: %s", entityName, inn);
    }
}
