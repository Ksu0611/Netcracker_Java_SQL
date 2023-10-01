 class Matrix {
     private double[][] values;
     private int rows;
     private int columns;

     public Matrix(double[][] values, int rows, int columns) {   //конструктор
         this.values = values;
         this.rows = rows;
         this.columns = columns;
     }
     /*Функция сложения матриц*/
     /*--------------------------------------------------------*/
     public Matrix add(Matrix other) {
         if (rows != other.rows || columns != other.columns) {
             throw new IllegalArgumentException("Матрицы имеют разное количество строк или столбцов.");
         }

         double[][] result = new double[rows][columns];
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 result[i][j] = values[i][j] + other.values[i][j];
             }
         }
         return new Matrix(result, rows, columns);
     }
     /*--------------------------------------------------------*/
     /*Функция умножения на скаляр*/
     /*--------------------------------------------------------*/
     public Matrix multiplyByScalar(double scalar) {
         double[][] result = new double[rows][columns];
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 result[i][j] = values[i][j] * scalar;
             }
         }

         return new Matrix(result, rows, columns);
     }
     /*--------------------------------------------------------*/
     /*Функция вывода матрицы*/
     /*--------------------------------------------------------*/
     public void print() {
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 System.out.print(values[i][j] + " ");
             }
         }
         System.out.println();
     }
     /*--------------------------------------------------------*/

 }