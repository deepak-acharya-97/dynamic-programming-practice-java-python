// Explanation:
// 1==========>> n = 0, C(0,0) = 1
// 1–1========>> n = 1, C(1,0) = 1, C(1,1) = 1
// 1–2–1======>> n = 2, C(2,0) = 1, C(2,1) = 2, C(2,2) = 1
// 1–3–3–1====>> n = 3, C(3,0) = 1, C(3,1) = 3, C(3,2) = 3, C(3,3)=1
// 1–4–6–4–1==>> n = 4, C(4,0) = 1, C(4,1) = 4, C(4,2) = 6, C(4,3)=4, C(4,4)=1
// So here every loop on i, builds i’th row of pascal triangle, using (i-1)th
// row

// At any time, every element of array C will have some value (ZERO or more) and
// in next iteration, value for those elements comes from previous iteration.
// In statement,
// C[j] = C[j] + C[j-1]
// Right hand side represents the value coming from previous iteration (A row of
// Pascal’s triangle depends on previous row). Left Hand side represents the
// value of current iteration which will be obtained by this statement.

// Let's say we want to calculate C(4, 3),
// i.e. n=4, k=3:

// All elements of array C of size 4 (k+1) are
// initialized to ZERO.

// i.e. C[0] = C[1] = C[2] = C[3] = C[4] = 0;
// Then C[0] is set to 1

// For i = 1:
// C[1] = C[1] + C[0] = 0 + 1 = 1 ==>> C(1,1) = 1

// For i = 2:
// C[2] = C[2] + C[1] = 0 + 1 = 1 ==>> C(2,2) = 1
// C[1] = C[1] + C[0] = 1 + 1 = 2 ==>> C(2,2) = 2

// For i=3:
// C[3] = C[3] + C[2] = 0 + 1 = 1 ==>> C(3,3) = 1
// C[2] = C[2] + C[1] = 1 + 2 = 3 ==>> C(3,2) = 3
// C[1] = C[1] + C[0] = 2 + 1 = 3 ==>> C(3,1) = 3

// For i=4:
// C[4] = C[4] + C[3] = 0 + 1 = 1 ==>> C(4,4) = 1
// C[3] = C[3] + C[2] = 1 + 3 = 4 ==>> C(4,3) = 4
// C[2] = C[2] + C[1] = 3 + 3 = 6 ==>> C(4,2) = 6
// C[1] = C[1] + C[0] = 3 + 1 = 4 ==>> C(4,1) = 4

// C(4,3) = 4 is would be the answer in our example.