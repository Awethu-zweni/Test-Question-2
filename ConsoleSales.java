public class ConsoleSales extends Console{

    public ConsoleSales (String consoleType, String store, int totalSales){
        super(consoleType, store, totalSales);
    }

    @Override
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*".repeat(20));
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getStore());
    }
}
