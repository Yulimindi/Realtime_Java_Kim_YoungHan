package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) { // for문 안에 있는 거 메서드로 만들고 싶으면 그거 드래그 해서 ctrl + alt + m 하면 만들어짐
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끄으으으으ㅡ으읏");
    }

}
