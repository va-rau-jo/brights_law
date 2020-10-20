## Bright’s Law by Reduction

#### All possible permutations of 3 integers can be reduced to all possible permutations of 3 positive digits (numbers between 0-9 inclusive).

#### This starts us off with 1000 total permutations, begin reducing the number based on rules:

1. Contains at least one 0: 729
 
2. Contains at least one 5: 512

3. Contains at least one repeated digit: 336

4. Not in ascending order: 56

5. Two digits add to get 10: 32

6. Three digits add to get 10: 30

7. Three digits add to get 20: 28

8. Subtract two lowest digits from highest digit to get 0: 22

9. Add two digits to get 5, last digit is even: 18

10. Add two digits to get 15, last digit is even: 14

11. Subtract two digits to get 5, last digit is even: 6

12. Add highest two digits and subtract lowest digit to get 10: 0
