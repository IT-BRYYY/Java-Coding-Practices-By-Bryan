public class TaxTable {

    public static void main(String[] args) {

        // Print table header
        System.out.printf("%-12s%-10s%-18s%-18s%-15s\n",
                "Taxable", "Single", "Married Joint", "Married Sep", "Head House");

        // Loop from 50,000 to 70,000
        for (int income = 50000; income <= 70000; income += 100) {

            System.out.printf("%-12d", income);

            // Status 0 to 3
            for (int status = 0; status <= 3; status++) {
                long tax = Math.round(computeTax(status, income));
                System.out.printf("%-18d", tax);
            }

            System.out.println();
        }
    }

    // Method to compute tax
    public static double computeTax(int status, double income) {

        double tax = 0;

        if (status == 0) { // Single
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 835 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 4677.5 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 16752.5 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 41754.5 + (income - 171550) * 0.33;
            else
                tax = 108216.5 + (income - 372950) * 0.35;

        } else if (status == 1) { // Married Joint
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 1670 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 9355 + (income - 67900) * 0.25;
            else if (income <= 208850)
                tax = 26642.5 + (income - 137050) * 0.28;
            else if (income <= 372950)
                tax = 46792.5 + (income - 208850) * 0.33;
            else
                tax = 101085 + (income - 372950) * 0.35;

        } else if (status == 2) { // Married Separate
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 835 + (income - 8350) * 0.15;
            else if (income <= 68525)
                tax = 4677.5 + (income - 33950) * 0.25;
            else if (income <= 104425)
                tax = 13338.75 + (income - 68525) * 0.28;
            else if (income <= 186475)
                tax = 23346.75 + (income - 104425) * 0.33;
            else
                tax = 50462.75 + (income - 186475) * 0.35;

        } else if (status == 3) { // Head of Household
            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = 1195 + (income - 11950) * 0.15;
            else if (income <= 117450)
                tax = 6227.5 + (income - 45500) * 0.25;
            else if (income <= 190200)
                tax = 24162.5 + (income - 117450) * 0.28;
            else if (income <= 372950)
                tax = 44530 + (income - 190200) * 0.33;
            else
                tax = 104424.5 + (income - 372950) * 0.35;
        }

        return tax;
    }
}