package be.intecbrussel;

public class Apple {
        private String name;

        public Apple(String s){
            this.name = s;
        }
        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "name='" + name + '\'' +
                    '}';
        }
}
