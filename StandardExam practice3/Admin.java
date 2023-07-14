package Standard3;

public class Admin {
	//implement
    Department[] department;

    public Admin(Department[] department) {
        this.department=department;
    }

    public String hourlyCompanyMessage(){
        String output ="";
        for (Department dep: department){
            var queue=dep.getQueue();
            try {
                output+= String.format("%s:\t %s \n",dep.getName(), queue.peek());
                queue.dequeue();
            } catch (EmptyQueueException e) {
                throw new RuntimeException(e);
            }
        }
        return output;
    }
}
