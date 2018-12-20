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