public class Animal {
    public void eat(){
        System.out.println("animalul mananca");
    }
    public void sound(){
        System.out.println("animalul scoate un sunet");
    }
}
    class Lion extends Animal{
        public void eat(){
            System.out.println("rawwwrrr");
        }
        public void sound(){
            System.out.println("leul manaca marne");
        }

}
    class Tiger extends  Animal{
        public void eat(){
            System.out.println("porci mistreti,caprioare,mainute");
        }
        public void sound(){
            System.out.println("growl, roar");
        }
}

    class Panther extends  Animal{
        public void eat(){
            System.out.println("caprioara, misteti si ratoni");
        }
        public void sound(){
            System.out.println("growls, hisses, and purrs");
        }
}
