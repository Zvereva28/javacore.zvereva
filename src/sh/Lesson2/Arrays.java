package sh.Lesson2;



public class Arrays {



    void ChangeArrays(String ar[][]) throws MyArraySizeException, MyArrayDataException {
        int size1 = ar.length;
        int size2 = ar[0].length;
        int sum = 0;

        if (size1 != 4 || size2 != 4) throw new MyArraySizeException("ВНИМАНИЕ!!! мАССИВ должен быть 4х4");

        for (int i = 0; i < size1; i++){
            for (int j = 0; j < size2; j ++){
                try {
//                    System.out.println(ar[i][j]);
                    sum = sum + Integer.parseInt(ar[i][j]);

                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);

                }

            }
        }
        System.out.println("сумма элементов массива " + sum);
    }




}


