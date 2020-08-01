package pratical_exam;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static int menu() {
        System.out.println("1. Enter the list of employees and insurances they sell.");
        System.out.println("2. Export the information of employees (including salaries) and the insurance they sell");
        System.out.println("3. Export the list of employees with commission> 50USD.");
        System.out.println("4. Export the list of employees who are fined.");
        System.out.println("5. Export the list of employees who are awarded 100USD.");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }

    public static void main(String[] args) {
        Company company = new Company();
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    company.inputEmployee();
                    break;
                case 2:
                    company.displayAllEmployee();
                    break;
                case 3:
                    company.employeeHasBonusGreater50USD();
                    break;
                case 4:
                    company.displayEmployeeBeFined();
                    break;
                case 5:
                    company.employeeHasBonus100USD();
                    break;
            }
        } while (choice != 6);
    }
}
