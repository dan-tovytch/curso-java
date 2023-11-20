package test;

public class test {
        static class Animal {
            void som() {
                System.out.println("Som genérico de um animal");
            }
        }

        static class Cachorro extends Animal {
            void som() {
                System.out.println("Latido de cachorro");
            }
        }

        public static void main(String[] args) {
            Animal animal = new Cachorro();
            animal.som();
        }


}


