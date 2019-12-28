package sh.Lesson1;



public class Man  implements sh.Lesson1.Moving {
    String  name;
    int maxrun;
    int maxjump;

    public Man(String name, int maxrun, int maxjump) {
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

    @Override
    public boolean run(sh.Lesson1.Track track) {
        boolean bool = false;
        if (track.tracklong < maxrun){
            bool = true;
            System.out.println("Man " + name + " может пробежать "+ track.name + "  " + track.tracklong + "км");}
        else System.out.println("Man " + name + "НЕ может пробежать "+ track.name);
        return bool;


    }

    @Override
    public boolean jump(sh.Lesson1.Wall wall) {
        boolean bool = false;
        if (wall.height < maxjump){
            bool = true;
            System.out.println("Man " + name + " может перепрыгнуть " + wall.name + "  " +  wall.height + "м");}
        else System.out.println("Man " + name + " НЕ может перепрыгнуть" + wall.name);
        return bool;

    }
}
