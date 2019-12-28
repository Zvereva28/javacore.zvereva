package sh.Lesson1;

public class Track implements sh.Lesson1.Difficulty {
    String name;
    int tracklong;

    public Track(String name, int tracklong){
        this.name = name;
        this.tracklong = tracklong;
    }

    @Override
    public boolean difficulty(Moving one) {
        return one.run(this);

    }

}

