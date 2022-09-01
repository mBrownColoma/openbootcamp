public class Main {

    public static void main(String[] args) {
        //int total;
        //total = suma(10, 30);
        //System.out.print(total);

        Stock newStock = new Stock();
        newStock.SumarStock();
        newStock.SumarStock();
        newStock.SumarStock();
        newStock.SumarStock();
        System.out.println(newStock.cantidad);

    }

    public static int suma(int a, int b){
        int result;
        result = a + b;
        return result;
    }

    static class Stock{
        public int cantidad = 0;
        public void SumarStock(){
            this.cantidad++;
        }

    }
}
