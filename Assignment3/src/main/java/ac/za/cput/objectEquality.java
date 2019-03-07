package ac.za.cput;

public class objectEquality {
    private static ac.za.cput.objectEquality objectEquality = null;

    private objectEquality() {
    }

    public static ac.za.cput.objectEquality getInstance() {
        if (objectEquality == null) {
            objectEquality = new objectEquality();
        }
        return objectEquality;
    }
}
