import java.text.ParseException;
public class Main {

	public static void main(String[] args)throws ParseException {
		MyList<Integer> intList = new MyList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Integer List: " + intList);
        intList.deleteByIndex(1);
        System.out.println("After deleting index 1: " + intList);
        intList.deleteByValue(30);
        System.out.println("After deleting Value 30: " + intList);
        System.out.println("After retrieving Value at index 0: " + intList.get(0));
        

        // Create a list for String
        MyList<String> strList = new MyList<>();
        strList.add("Hello");
        strList.add("World");
        System.out.println("String List: " + strList);
        strList.deleteByValue("Hello");
        System.out.println("After deleting 'Hello': " + strList);

        // Create a list for a custom class
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return name + " (" + age + ")";
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Person person = (Person) obj;
                return age == person.age && name.equals(person.name);
            }
        }
        System.out.println("******************************************");
        MyList<Person> personList = new MyList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        System.out.println("Person List: " + personList);
        personList.deleteByValue(new Person("Alice", 25));
        System.out.println("After deleting Alice: " + personList);
        
        System.out.println("******************************************");
        
        
        MyList<Employee> employeeList = new MyList<>();

        // Add Employee objects
        employeeList.add(new Employee("E001", "Alice", 30, "2020-05-01"));
        employeeList.add(new Employee("E002", "Bob", 28, "2021-03-15"));
        employeeList.add(new Employee("E003", "Charlie", 35, "2019-07-10"));

        // Display the list
        System.out.println("Employee List: " + employeeList);

        // Retrieve an employee by index
        Employee emp = employeeList.get(1);
        System.out.println("Employee at index 1: " + emp);

        // Delete an employee by index
        employeeList.deleteByIndex(0);
        System.out.println("After deleting index 0: " + employeeList);

        // Delete an employee by value
        employeeList.deleteByValue(new Employee("E003", "Charlie", 35, "2019-07-10"));
        System.out.println("After deleting Charlie: " + employeeList);
        
        System.out.println("******************************************");
        
        SingleDigitChecker Checker = new SingleDigitChecker();
        int[] testNumbers = {5, 12, -3, 123, -50, 7};

        for (int num : testNumbers) {
            try {
                Checker.checkSingleDigit(num);
                System.out.println("The number " + num + " is a single digit.");
            } catch (SingleDigitException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        
        System.out.println("******************************************");
        
        double transactionAmount = 5000.0;

        Bank bank = new Bank();
        System.out.println("Default Bank Transaction Charge: " + bank.calculateTransactionCharge(transactionAmount));

        ICICI icici = new ICICI();
        System.out.println("ICICI Transaction Charge: " + icici.calculateTransactionCharge(transactionAmount));

        HDFC hdfc = new HDFC();
        System.out.println("HDFC Transaction Charge: " + hdfc.calculateTransactionCharge(transactionAmount));
	}
}
