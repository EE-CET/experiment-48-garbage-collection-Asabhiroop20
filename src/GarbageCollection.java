public class GarbageCollection {
    

    @Override
    protected void finalize() {
        System.out.print("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        
        // Make object eligible for GC
        obj = null;

        // Request garbage collection
        System.gc();
    }
}
