public class Main {
    public static void main(String[] args) {
        double[] fractionNumb = {11.5, 22.3, -13.1, 14.1, -6.2, 1.2, 37.3, -25.5, -8.1, 12.1, 6.4, -6.7, -9.27, 3.2, 11.1,};
        boolean examination = false;
        int zeroInt = 0;
        double zeroDouble = 0;
        for(double numbers : fractionNumb){
            if(numbers <0){
                examination = true;
            }else if (numbers > 0 && examination){
                zeroDouble = numbers;
                zeroInt++;
                System.out.println(numbers);
            }
        }
        System.out.println("Вывод среднего арифметческого числа :" + zeroDouble / zeroInt);
        sorting();
    }
    public static void sorting (){

        int[] num = {-3, 22, 18, -10, -17};
        int zero = 0;


        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    zero = num[i];
                    num[i] = num[j];
                    num[j] = zero;
                }
            }
        }  System.out.println("Сортировка: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
    