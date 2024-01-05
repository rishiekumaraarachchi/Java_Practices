enum Status {
    PENDING,
    ACTIVE,
    INACTIVE,
    DELETED
}

public class Enums {
    public static void main(String[] args) {
        Status [] statuses = Status.values();

        for (Status x : statuses) {
            System.out.println(x);
        }

        
}
}