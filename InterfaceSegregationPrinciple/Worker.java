public class Worker 
{
    private WorkerInterface workerInterface;

    public Worker(WorkerInterface workerInterface) {
        this.workerInterface = workerInterface;
    }

    public void configureCourseRegistrationPeriod() {
        workerInterface.setCourseRegistrationPeriod();
    }

    public void configureGradeViewingPeriod() {
        workerInterface.setGradeViewingPeriod();
    }
}
