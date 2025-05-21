public class Work {
    private TaskSave taskRepository;
    public Work (TaskSave taskRepository) {
        this.taskRepository = taskRepository;
    }
    public void addTask(ADDTASK task) {
        System.out.println("Processing task: " + task.getTitle());
        taskRepository.saveTask(task); // Delegate DB interaction
    }
}
