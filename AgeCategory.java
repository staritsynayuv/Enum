public enum AgeCategory {

    YOUNG(18, 29),
    AVERAGE(30, 49),
    ELDERLY(50, 64),
    SENILE(65, 150);

    private final int left;
    private final int right;

    AgeCategory(int left, int right) {
        this.left = left;
        this.right = right;
    }


    public static AgeCategory valueOf(int age) {
        for (AgeCategory value : values()) {
            if ((age >= value.left) && (age <= value.right)) {
                return value;
            }
        }

        throw new IllegalArgumentException();
    }

}

