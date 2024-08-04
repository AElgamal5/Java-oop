package AElgamal5;

public enum DaysWithAbbreviation {

    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"),
    THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

    private String abbreviation;

    // private to prevent creating new instance
    private DaysWithAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    // should not exist or make it private to make enums constants as it designed
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
