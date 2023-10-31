package Task1;

public class Person implements PersonalData {
    /**
     * Физ. лицо
     */

    private String fio;

    private String inn;

    public String getFio() {
        return fio;
    }

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s; INN: %s", fio, inn);
    }
}
