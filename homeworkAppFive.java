public class homeworkAppFive {
    public static void main(String[] args) {

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Ivanov", "engineer", "no1@enterprize.com", "+79998887761", 40000, 41);
        empArr[1] = new Employee("Petrov", "engineer", "no2@enterprize.com", "+79998887762", 40000, 25);
        empArr[2] = new Employee("Sidorov", "senior engineer", "no3@enterprize.com", "+79998887763", 45000, 40);
        empArr[3] = new Employee("Ronzhin", "project manager", "no4@enterprize.com", "+79998887764", 55000, 36);
        empArr[4] = new Employee("Spirin", "junior ", "no5@enterprize.com", "+79998887765", 20000, 20);

        for(int i = 0; i < empArr.length; i++) {
            if (empArr[i].age >= 40) {
                empArr[i].info();
            }
        }
    }


}
