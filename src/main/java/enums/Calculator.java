package enums;

enum Calculator {
        ADDITION("+"){
            int calculate(int x, int y){
                return x + y;
            }
        },
        SUBTRACTION("-"){
            int calculate(int x, int y){
                return x - y;
            }
        },
        MULTIPLY("*") {
            int calculate(int x, int y){
                return x * y;
            }
        },
        DIVISION("/") {
            int calculate(int x, int y){
                return x / y;
            }
        };

        private final String s;

        Calculator(String s) {
            this.s = s;
        }

        public String toString() {
            return s;
        }
        abstract int calculate(int x, int y);
}