package Reflections;

import java.lang.reflect.*;

class Bird{
    public String name;
    private String sound;

    public void Name(String name){
        System.out.println(name);
    }

    private void Sound(String sound){
        System.out.println(sound);
    }

    public String getSound() {
        return sound;
    }
}

class Animal{
    public String sound;
    private void Sound(){
        System.out.println();
    }
    public void Name(){
        System.out.println("Animal");
    }
}
public class Main {
    static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // Gives the Object of the class and also the metadata information
        Class birdClass = Class.forName("Reflections.Bird");

        Class newBirdClass = Bird.class;

        Bird parrot = new Bird();

        // this Class is created by the JVM at the RunTime.
        Class newParrot = parrot.getClass();

        // just gives the name of the class
        System.out.println(newBirdClass.getName());
        // just gives the access modifier of the class
        System.out.println(Modifier.toString(newBirdClass.getModifiers()));

        // getField vs getDeclared field (also gives the private field / methods)
        Method[] methods = newBirdClass.getMethods();
        Method[] allMethods = newBirdClass.getDeclaredMethods();

        // Prints all the internal methods too
        for(Method method : methods){
            System.out.println("Gives Name via the getName : " + method.getName());
            System.out.println("GetClass Called : " + method.getClass());
        }

        System.out.println();
        System.out.println();

        // prints all the Class related methods only
        for(Method method : allMethods){
            System.out.println("Gives Name via the getName : " + method.getName());
            System.out.println("GetClass Called : " + method.getClass());
        }

        // Object invocation
        Object birdObject = birdClass.newInstance();

        Method birdObjectMethod = birdClass.getMethod("Name", String.class);
        birdObjectMethod.invoke(birdObject, "Parrot");


        Bird sparrow = new Bird();
        //Setting the value of the class
        Field field = newBirdClass.getDeclaredField("name");
        field.set(sparrow, "Bulbul");
        System.out.println();
        sparrow.Name(sparrow.name);

        System.out.println();

        // modified the private variable too
        // Breaks the Encapsulation
        Field privateField = newBirdClass.getDeclaredField("sound");
        privateField.setAccessible(true);
        privateField.set(sparrow, "Pew pew");
        System.out.println(sparrow.getSound());

        // Reflection Breaks the Singleton of the Class
        // Reflection makes slow as it happens on the Runtime
        // breaks the OOPS principal
        Class tiger = Animal.class;
        Constructor[] constructors = tiger.getDeclaredConstructors();

        for(Constructor animalConstructor : constructors){
            System.out.println("Modifiers of the Constructor : " + Modifier.toString(animalConstructor.getModifiers()));
            animalConstructor.setAccessible(true);
            Animal innerAnimal = (Animal) animalConstructor.newInstance();
            innerAnimal.Name();
        }
    }
}
