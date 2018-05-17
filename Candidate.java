public enum Candidate {
    FIRST("Петр Васильевич"),
    SECOND("Михаил Анатольевич"),
    THIRD("Анатолий Николаевич");

    private final String fio;

    Candidate(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }
}
