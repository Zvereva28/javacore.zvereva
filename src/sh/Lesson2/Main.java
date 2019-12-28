package sh.Lesson2;

public class Main {

    public static void main(String[] args) {

                String arr[][] = new String[2][2];
                arr[0][0] = "25";
                arr[0][1] = "5";
                arr[1][0] = "25";
                arr[1][1] = "65";

                String arr2[][] = new String[4][4];
                arr2[0][0] = "25";
                arr2[0][1] = "5";
                arr2[0][2] = "25";
                arr2[0][3] = "65";
                arr2[1][0] = "25";
                arr2[1][1] = "5";
                arr2[1][2] = "2ft5";
                arr2[1][3] = "65";
                arr2[2][0] = "25";
                arr2[2][1] = "5";
                arr2[2][2] = "25";
                arr2[2][3] = "65";
                arr2[3][0] = "5";
                arr2[3][1] = "5";
                arr2[3][2] = "25";
                arr2[3][3] = "65";

        String arr3[][] = new String[4][4];
        arr3[0][0] = "25";
        arr3[0][1] = "5";
        arr3[0][2] = "25";
        arr3[0][3] = "65";
        arr3[1][0] = "25";
        arr3[1][1] = "5";
        arr3[1][2] = "2";
        arr3[1][3] = "65";
        arr3[2][0] = "25";
        arr3[2][1] = "5";
        arr3[2][2] = "25";
        arr3[2][3] = "0";
        arr3[3][0] = "5";
        arr3[3][1] = "5";
        arr3[3][2] = "25";
        arr3[3][3] = "6";

        try {

                Arrays h1 = new Arrays();
                h1.ChangeArrays(arr);


            }catch (MyArrayDataException e){
                System.out.println("Элемент массива с номером [" + e.i +"]" + "[" + e.j + "]" + " не верного формата");}
            catch (MyArraySizeException ex) {
                System.out.println(ex.getMessage());
            }


        try {
            System.out.println("----------------");
            Arrays h2 = new Arrays();
            h2.ChangeArrays(arr2);

            }catch (MyArrayDataException e){
                System.out.println("Элемент массива с номером [" + e.i +"]" + "[" + e.j + "]" + " не верного формата");}
        catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("----------------");
            Arrays h1 = new Arrays();
            h1.ChangeArrays(arr3);


        }catch (MyArrayDataException e){
            System.out.println("Элемент массива с номером [" + e.i +"]" + "[" + e.j + "]" + " не верного формата");}
        catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        }


    }
}

