//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Select the console type");
    System.out.println(" 1) PS5");
    System.out.println(" 2) XBOX");
    System.out.println(" 2) SWITCH");
    System.out.println();

    int choice = Integer.parseInt(input.nextLine());

    String consoleType;
    switch (choice) {
        case 1:
            consoleType = "PS5";
            break;
        case 2:
            consoleType = "XBOX";
            break;
        case 3:
            consoleType = "SWITCH";
            break;
        default:
            System.out.println("Invalid selection.");
            return;
    }

    System.out.println("Enter the store: ");
    String store =input.nextLine();

    System.out.println("Enter the total sales of " + consoleType + " consoles for " + store + ":");
    int totalSales = Integer.parseInt(input.nextLine());

    System.out.println();

    ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
    sales.printReport();
}
