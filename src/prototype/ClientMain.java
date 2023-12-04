package src.prototype;

public class ClientMain {
    private static void fillregistry(Registry registry) {
        Student aprBatch = new Student(80, "AprilBatch");
//        aprBatch.averageBatchPsp = 80;
//        aprBatch.batchName = "AprilBatch";

        Student sepBatch = new IntelligentStudent(90, "SeptemberBatch");
//        sepBatch.averageBatchPsp = 90;
//        sepBatch.batchName = "SeptemberBatch";

        registry.register("AprilBatch", aprBatch);
        registry.register("SeptemberBatch", sepBatch);
    }

    public static void main(String[] args) {
        Registry registry = new Registry();
        fillregistry(registry);
        Student Arun = registry.get("aprBatch").clone();
        Arun.setName("Arun");
        Arun.setPsp(99);

        Student Revanth = registry.get("sepBatch").clone();
        Revanth.setName("Revanth");
        Revanth.setPsp(100);

        System.out.println("Debug");
    }
}
