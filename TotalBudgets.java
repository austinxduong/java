public class TotalBudgets {
    public static double totalBudg(Person[] persons) {
        double results = 0.0;
        for (Person p : persons) {
            results += p.getBudget();
        }
        return results;
    }

    class Person {
        private String name;
        private int age;
        private double budget;

        public Person(String name, int age, double budget) {
            super();
            this.name = name;
            this.age = age;
            this.budget = budget;

        }
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getBudget() {
            return budget;
        }

        public void setBudget(double budget) {
            this.budget = budget;
        }
    }

    public static void main(String[] args) {
       
        Person[] person = new Person("namee", 18, 800.00);
        
        System.out.println(totalBudg(person));
    }
}
