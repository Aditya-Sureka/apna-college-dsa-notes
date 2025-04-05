package Patterns;
public class Patterns {

    public static void main(String args[]) {

    }
}

// Hollow Rectangle Pattern

// public static void hollow_Rectangle(int totRows, int totCols) {
// outer loop
// for (int i = 1; i <= totRows; i++) {
// inner columns
// for (int j = 1; j <= totCols; j++) {
// cell -(i, j)
// if (i == 1 || i == totRows || j == 1 || j == totCols) {
// boundary cells
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// hollow_Rectangle(4, 5);

// Inverted Half Pyramid Pattern

// public static void inverted_rotated_half_pyramid(int n) {
// outer
// for (int i = 1; i <= n; i++) {
// spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// stars
// for (int k = 1; k <= i; k++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// inverted_rotated_half_pyramid(4);

// Half Pyramid With Numbers

// public static void inverted_half_pyramid_withNumbers(int n) {
// for (int i = 1; i <= n; i++) {
// inners- numbers
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// inverted_half_pyramid_withNumbers(5);

// Floyds Triangle Pattern

// public static void floyds_triangle(int n) {
// // outer
// int counter = 1;
// for (int i = 1; i <= n; i++) {
// // inner - How many times will counter be printed
// for (int j = 1; j <= i; j++) {
// System.out.print(counter + " ");
// counter++;
// }
// System.out.println();
// }
// }
// floyds_triangle(5);

// Zero One Triangle

// public static void zero_one_triangle(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// if ((i + j) % 2 == 0) {
// System.out.print("1" + " ");
// } else {
// System.out.print("0" + " ");
// }
// }
// System.out.println();
// }
// }
// zero_one_triangle(5);

// Butterfly Pattern

// public static void butterfly(int n) {
// // 1st half
// for (int i = 1; i <= n; i++) {
// // stars - i
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// // spaces- 2 *(n - i)
// for (int j = 1; j <= 2 * (n - i); j++) {
// System.out.print(" ");
// }
// // stars - i
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// // 2nd half
// for (int i = n; i >= 1; i--) {
// // stars - i
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// // spaces- 2 *(n - i)
// for (int j = 1; j <= 2 * (n - i); j++) {
// System.out.print(" ");
// }
// // stars - i
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// butterfly(4);

// Solid Rhombus Pattern

// public static void solid_rhombus(int n) {
// for (int i = 1; i <= n; i++) {
// // spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// // stars
// for (int j = 1; j <= n; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// solid_rhombus(5);

// Hollow Rhombus Pattern
// public static void hollow_rhombus(int n) {
// for (int i = 1; i <= n; i++) {
// // spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// // hollow rectangle - stars
// for (int j = 1; j <= n; j++) {
// if (i == 1 || i == n || j == 1 || j == n) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// hollow_rhombus(5);

// Diamond Pattern
// public static void diamond(int n) {
// // 1st half
// for (int i = 1; i <= n; i++) {
// // spaces
// for (int j = 1; j <= (n - i); j++) {
// System.out.print(" ");
// }
// // stars
// for (int j = 1; j <= (2 * i) - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// // 2nd half
// for (int i = n; i >= 1; i--) {
// // spaces
// for (int j = 1; j <= (n - i); j++) {
// System.out.print(" ");
// }
// // stars
// for (int j = 1; j <= (2 * i) - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// diamond(4);