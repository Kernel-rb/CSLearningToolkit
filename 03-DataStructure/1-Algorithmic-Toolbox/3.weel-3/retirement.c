#include <stdio.h>
#include <stdlib.h>

struct  _retire_info {
    int months;
    double contribution;
    double rate_of_return;
};

typedef struct _retire_info retire_info;



void calculate_balance(int *age, double *balance, retire_info phase) {
    for (int i = 0; i < phase.months; i++) {
        // Print the current age and balance
        printf("Age %3d month %2d you have $%.2lf\n", *age / 12, *age % 12, *balance);

        // Calculate the interest earned and update the balance
        *balance += (*balance * phase.rate_of_return) + phase.contribution;

        // Move to the next month
        (*age)++;
    }
}

void retirement(int startAge, double initial, retire_info working, retire_info retired) {
    int age = startAge;      // Initialize age in months
    double balance = initial; // Initialize balance with the initial savings

    // Calculate balance while working
    calculate_balance(&age, &balance, working);

    // Calculate balance during retirement
    calculate_balance(&age, &balance, retired);
}

// MAIN FUNC 
int main() {
    // Define the working phase
    retire_info working;
    working.months = 489;
    working.contribution = 1000.0;
    working.rate_of_return = 0.045 / 12.0;

    // Define the retirement phase
    retire_info retired;
    retired.months = 384;
    retired.contribution = -4000.0;
    retired.rate_of_return = 0.01 / 12.0;

    // Starting conditions
    int startAge = 327;        // Age in months (27 years, 3 months)
    double initialSavings = 21345.0;  // Initial savings in dollars

    // Calculate the retirement savings
    retirement(startAge, initialSavings, working, retired);

    return 0;
}
