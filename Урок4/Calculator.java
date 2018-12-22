/*
* класс
* */
    public class Calculator{

        private int result;
        /*
        Суммируем аргументы
        * */
        public void add(int ... params){
            for (int param:params){
                this.result += param;
            }
        }
    public  void  Multiplication(int ... params){
        this.result = 1;
        for (int param:params){
            this.result *= param;
        }
    }
        public  void  Subtraction(int ... params){

            for (int param:params){
                this.result -= param;
            }
        }
        public  void  Division(int ... params){
            this.result = params[0];
                this.result /= params[1];
        }

        /*
        * Получить результат
        * */
        public int getResult(){
            return this.result;
        }
        /*
        * Очистить результат
        * */
        public void cleanResult(){
            this.result = 0;
        }

}